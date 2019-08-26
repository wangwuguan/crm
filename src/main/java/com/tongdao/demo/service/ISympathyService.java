package com.tongdao.demo.service;

import com.tongdao.demo.entity.query.SympathyQuery;
import com.tongdao.demo.entity.vo.PageResultVo;

/**
 * @Author: will.Wang
 * @Version: V-1.0
 * @Date: 2019/8/18 15:31
 * @Description:
 */
public interface ISympathyService {

    /**
     * 查询全部生日慰问记录
     * @return
     */
    PageResultVo<Object> listSympathy(SympathyQuery sympathyQuery);

}
