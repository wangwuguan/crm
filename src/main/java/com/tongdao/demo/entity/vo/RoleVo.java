package com.tongdao.demo.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleVo {
    /**
     * id
     */
    private Integer id;
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
    /**
     * 角色状态
     */
    private Integer roleState;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 修改时间
     */
    private String updateTime;
}
