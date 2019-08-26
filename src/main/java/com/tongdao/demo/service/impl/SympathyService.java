package com.tongdao.demo.service.impl;

import com.tongdao.demo.entity.query.SympathyQuery;
import com.tongdao.demo.entity.vo.PageResultVo;
import com.tongdao.demo.entity.vo.SympathyVo;
import com.tongdao.demo.mapper.ISympathyMapper;
import com.tongdao.demo.service.ISympathyService;
import com.tongdao.demo.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: will.Wang
 * @Version: V-1.0
 * @Date: 2019/8/18 15:31
 * @Description:
 */
@Service
public class SympathyService implements ISympathyService {

    @Autowired
    private ISympathyMapper sympathyMapper;


    @Override
    public PageResultVo<Object> listSympathy(SympathyQuery sympathyQuery) {
        PageUtil.pageAssignment(sympathyQuery);
        List<SympathyVo> sympathies = sympathyMapper.listSympathy(sympathyQuery);
        int countSympathy = sympathyMapper.countSympathy(sympathyQuery);
        return PageUtil.selectResult(countSympathy, sympathies);
    }
}
