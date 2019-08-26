package com.tongdao.demo.util;

import com.tongdao.demo.entity.query.PageQuery;
import com.tongdao.demo.entity.vo.PageResultVo;

import java.util.List;
import java.util.Map;

public class PageUtil {

    /**
     * 分页中对前台传入map进行处理
     * @param pageQuery
     * @return
     */
    public static PageQuery pageAssignment(PageQuery pageQuery) {
        //获取page里面的参数值
        Integer page = pageQuery.getPage();
        Integer limit = pageQuery.getLimit();
        //为map重新赋值
        page = (page-1)*limit;
        pageQuery.setPage(page);
        return pageQuery;
    }

    /**
     * layui返回值处理
     * 与layui 分页接口对应
     * @param count 查询数据的长度
     * @param list 查询的数据的list<Object>集合
     * @return
     */
    public static PageResultVo<Object> selectResult(Integer count, List list){
        //创建一个返回类型
        PageResultVo<Object> userPage = new PageResultVo<Object>();
        //赋值数据长度
        userPage.setCount(count);
        //赋值数据列表
        userPage.setData(list);
        return userPage;
    }

    /**
     * 增删改返回值调用
     * @param i 受影响的行数
     */
    public static String toResult(int i) {
        if (i > 0) {
            //证明添加成功
            return SystemConstant.SUCCESS;
        }
        return SystemConstant.FAIL;
    }

}
