package com.tongdao.demo.entity.query;

/**
 * @Author: will.Wang
 * @Version: V-1.0
 * @Date: 2019/8/18 12:12
 * @Description: Layui分页
 */

public class PageQuery {
    /**
     * 页数
     */
    public Integer page = 1;
    /**
     * 每页显示的条数
     */
    public Integer limit = 5;
    /**
     * 开始时间
     */
    public String startTime;
    /**
     * 结束时间
     */
    public String endTime;

    public void setPage(Integer page) {
        this.page = page;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getPage() {
        return page;
    }

    public Integer getLimit() {
        return limit;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    @Override
    public String toString() {
        return "PageQuery{" +
                "page=" + page +
                ", limit=" + limit +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                '}';
    }
}
