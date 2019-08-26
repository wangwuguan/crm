package com.tongdao.demo.service;

import com.tongdao.demo.entity.dto.UserDto;
import com.tongdao.demo.entity.query.UserQuery;
import com.tongdao.demo.entity.vo.EchartsVo;
import com.tongdao.demo.entity.vo.PageResultVo;

/**
 * @program: crm
 * @description: 用户管理
 * @author: Wang.will
 * @create: 2019-08-13
 */
public interface IUserService {

    /**
     * 查询所有用户信息(分页)
     * @param user
     * @return
     */
    PageResultVo<Object> listUser(UserQuery user);

    /**
     * 添加新用户
     * @param user
     * @return
     */
    String insertUser(UserDto user);

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    String updateUser(UserDto user);

    /**
     * 删除用户(逻辑)
     * @param userDto
     * @return
     */
    String delUser(UserDto userDto);

    /**
     * 系统生成生日慰问记录
     */
    void BirthdaySympathy();

    /**
     * 获取用户生日月份统计数据
     * @return
     */
    EchartsVo dataBirthdayMonths();
}
