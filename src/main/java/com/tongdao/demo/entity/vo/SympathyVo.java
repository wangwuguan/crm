package com.tongdao.demo.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: will.Wang
 * @Version: V-1.0
 * @Date: 2019/8/18 12:29
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SympathyVo {
    /**
     * 自增id
     */
    private Integer id;
    /**
     * 用户编号
     */
    private String userId;
    /**
     * 描述
     */
    private String content;
    /**
     * 创建时间
     */
    private String createTime;
}
