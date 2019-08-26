package com.tongdao.demo.entity.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: will.Wang
 * @Version: V-1.0
 * @Date: 2019/8/18 12:21
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserQuery extends PageQuery{

    /**
     * 自增id
     */
    private Integer id;
    /**
     * 用户id
     */
    private String userId;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 用户性别
     */
    private String userSex;

}
