package com.tongdao.demo.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author: will.Wang
 * @Version: V-1.0
 * @Date: 2019/8/16 21:59
 * @Description: 时间相关
 */
public class DateUtil {

    /**
     * 获取系统当前时间
     * @return
     */
    public static String getNowTime() {
        Date now = new Date();
        // 修改日期格式
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String nowTime = dateFormat.format( now );
        return nowTime;
    }


    /**
     * 生成员工编号
     * @return
     */
    public static String getNum() {
        Date now = new Date();
        // 修改日期格式
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        return dateFormat.format( now );
    }

    /**
     * 获取N天后的时间
     * @return
     */
    public static String getNDaysAfter(int n) {
        Calendar calendar2 = Calendar.getInstance();
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd");
        calendar2.add(Calendar.DATE, n);
        String getNDaysAfter = sdf2.format(calendar2.getTime());
        return getNDaysAfter;
    }


    public static void main(String[] args) {
        System.out.println(getNDaysAfter(3));
    }
}
