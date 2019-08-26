package com.tongdao.demo.entity.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: will.Wang
 * @Version: V-1.0
 * @Date: 2019/8/18 12:30
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleQuery extends PageQuery{

    /**
     * 角色id(自增)
     */
    private Integer roleId;
    /**
     * 角色名称
     */
    private String roleName;
    /**
     * 角色描述
     */
    private String roleDescribe;
}
