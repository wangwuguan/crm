package com.tongdao.demo.service.impl;

import com.tongdao.demo.entity.dto.RoleDto;
import com.tongdao.demo.entity.query.RoleQuery;
import com.tongdao.demo.entity.vo.PageResultVo;
import com.tongdao.demo.entity.vo.RoleVo;
import com.tongdao.demo.mapper.IRoleMapper;
import com.tongdao.demo.service.IRoleService;
import com.tongdao.demo.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: crm
 * @description:
 * @author: Wang.will
 * @create: 2019-08-15
 */
@Service
public class RoleServiceImpl implements IRoleService {

    @Autowired
    private IRoleMapper roleMapper;

    @Override
    public List<RoleVo> listRoleAll() {
        return roleMapper.listRoleAll();
    }

    @Override
    public PageResultVo<Object> listRole(RoleQuery roleQuery) {
        PageUtil.pageAssignment(roleQuery);
        List<RoleVo> roles = roleMapper.listRole(roleQuery);
        int countRoles = roleMapper.countRole(roleQuery);
        return PageUtil.selectResult(countRoles, roles);
    }

    @Override
    public String insertRole(RoleDto roleDto) {
        return PageUtil.toResult(roleMapper.insertRole(roleDto));
    }

    @Override
    public String updateRole(RoleDto roleDto) {
        return PageUtil.toResult(roleMapper.updateRole(roleDto));
    }

    @Override
    public String changeRole(RoleDto roleDto) {
        return PageUtil.toResult(roleMapper.changeRole(roleDto));
    }

}
