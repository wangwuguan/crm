package com.tongdao.demo.entity.query;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: will.Wang
 * @Version: V-1.0
 * @Date: 2019/8/17
 * @Description:
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SympathyQuery extends PageQuery {
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
