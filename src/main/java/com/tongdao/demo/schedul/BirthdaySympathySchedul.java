package com.tongdao.demo.schedul;

import com.tongdao.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Author: will.Wang
 * @Version: V-1.0
 * @Date: 2019/8/16
 * @Description: 生日慰问定时任务
 */
@Component
public class BirthdaySympathySchedul {

    @Autowired
    private IUserService userService;

    /**
     * 系统生成生日慰问记录信息(提前一天)
     */

    @Scheduled(fixedRate = 86400000)
    public void BirthdaySympathy() {
        userService.BirthdaySympathy();
    }

    //fixedRate = 86400000 一天
}
