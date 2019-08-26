package com.tongdao.demo.controller;

import com.tongdao.demo.entity.query.SympathyQuery;
import com.tongdao.demo.entity.vo.PageResultVo;
import com.tongdao.demo.service.ISympathyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: will.Wang
 * @Version: V-1.0
 * @Date: 2019/8/18 15:28
 * @Description:
 */
@Controller
@RequestMapping("/sympathy")
public class SympathyController {

    @Autowired
    private ISympathyService sympathyService;

    /**
     * 跳转到SympathyRecords列表展示页面
     * @param model
     * @return
     */
    @RequestMapping("/toSympathy")
    public String toSympathyList(Model model) {
        return "records/sympathy_records";
    }

    /**
     * 查询全部生日慰问记录
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public PageResultVo<Object> listSympathy(SympathyQuery sympathyQuery) {
        return sympathyService.listSympathy(sympathyQuery);
    }
}
