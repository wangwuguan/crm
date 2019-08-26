package com.tongdao.demo.service.impl;

import com.tongdao.demo.entity.dto.SympathyDto;
import com.tongdao.demo.entity.dto.UserDto;
import com.tongdao.demo.entity.query.UserQuery;
import com.tongdao.demo.entity.vo.EchartsVo;
import com.tongdao.demo.entity.vo.PageResultVo;
import com.tongdao.demo.entity.vo.UserVo;
import com.tongdao.demo.mapper.ISympathyMapper;
import com.tongdao.demo.mapper.IUserMapper;
import com.tongdao.demo.service.IUserService;
import com.tongdao.demo.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserMapper userMapper;

    @Autowired
    private ISympathyMapper sympathyRecordsMapper;

    @Override
    public PageResultVo<Object> listUser(UserQuery userQuery) {
        PageUtil.pageAssignment(userQuery);
        List<UserVo> users = userMapper.listUser(userQuery);
        int countUser = userMapper.countUser(userQuery);
        return PageUtil.selectResult(countUser, users);
    }

    @Override
    public String insertUser(UserDto user) {
        return PageUtil.toResult(userMapper.insertUser(user));
    }

    @Override
    public String updateUser(UserDto user) {
        return PageUtil.toResult(userMapper.updateUser(user));
    }

    @Override
    public String delUser(UserDto userDto) {
        return PageUtil.toResult(userMapper.delUser(userDto));
    }

    @Override
    public void BirthdaySympathy() {
        // 获取一天之后生日的用户列表
        List<UserVo> users = userMapper.listBirthdayDayAfter();

        // 遍历用户，插入用户慰问记录信息
        for (UserVo user : users) {
            SympathyDto sympathyRecords = SympathyDto.builder()
                    .userId(user.getUserId())
                    .content("亲爱的"+user.getUserName()+"您好！明天是你的生日，在这里提前祝您生日快乐！")
                    .build();

            // 如果今年已经有生日慰问了,就不再添加
            Date now = new Date();
            // 获取当前时间的年份
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
            String nowYear = dateFormat.format( now );
            // 查询出明天将要生日的用户,有没有慰问记录,如果没有,添加慰问记录
            int countUserRecords = sympathyRecordsMapper.countUserRecords(user.getUserId(), nowYear);
            if (countUserRecords == 0) {
                // 插入慰问记录信息
                sympathyRecordsMapper.insertSympathyMapper(sympathyRecords);
            }
        }
    }

    @Override
    public EchartsVo dataBirthdayMonths() {
        List<UserVo> users = userMapper.dataBirthdayMonths();
        EchartsVo echarts = new EchartsVo();
        if (users.size() > 0) {
            for (UserVo user: users) {
                echarts.getCategories().add(user.getMonth());
                echarts.getData().add(user.getNum());
            }
        }
        return echarts;
    }

}
