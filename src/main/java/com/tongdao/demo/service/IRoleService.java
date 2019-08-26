package com.tongdao.demo.service;

import com.tongdao.demo.entity.dto.RoleDto;
import com.tongdao.demo.entity.query.RoleQuery;
import com.tongdao.demo.entity.vo.PageResultVo;
import com.tongdao.demo.entity.vo.RoleVo;

import java.util.List;

/**
 * @program: crm
 * @description:
 * @author: Wang.will
 * @create: 2019-08-15
 */
public interface IRoleService {

    /**
     * 查询全部角色信息
     * @return
     */
    List<RoleVo> listRoleAll();

    /**
     * 展示角色信息(分页)
     * @param roleQuery
     * @return
     */
    PageResultVo<Object> listRole(RoleQuery roleQuery);

    /**
     * 添加新角色
     * @param roleDto
     * @return
     */
    String insertRole(RoleDto roleDto);

    /**
     * 修改角色信息
     * @param roleDto
     * @return
     */
    String updateRole(RoleDto roleDto);

    /**
     * 启用/禁用角色
     * @param roleDto
     * @return
     */
    String changeRole(RoleDto roleDto);
}
