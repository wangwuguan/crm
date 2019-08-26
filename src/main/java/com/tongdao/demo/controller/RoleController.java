package com.tongdao.demo.controller;

import com.tongdao.demo.entity.dto.RoleDto;
import com.tongdao.demo.entity.query.RoleQuery;
import com.tongdao.demo.entity.vo.PageResultVo;
import com.tongdao.demo.entity.vo.RoleVo;
import com.tongdao.demo.service.IRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;
/**
 * @program: crm
 * @description: 角色控制层
 * @author: Wang.will
 * @create: 2019-08-15
 */
@Controller
@RequestMapping("/role")
@Api(tags="角色管理")
public class RoleController {

    @Autowired
    private IRoleService roleService;

    /**
     * 查询全部角色信息
     * @return
     */
    @RequestMapping(value = "/all", method = RequestMethod.POST)
    @ApiOperation(value = "查询全部角色信息")
    @ResponseBody
    List<RoleVo> listRoleAll() {
        return roleService.listRoleAll();
    }

    /**
     * 跳转到角色列表展示页面
     * @param model
     * @return
     */
    @RequestMapping(value = "/toRole", method = RequestMethod.GET)
    @ApiOperation(value = "跳转到角色列表展示页面")
    public String toRoleList(Model model) {
        return "role/role";
    }

    /**
     * 查询全部菜单
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ApiOperation(value = "查询全部菜单")
    @ResponseBody
    public PageResultVo<Object> listRole(RoleQuery roleQuery) {
        return roleService.listRole(roleQuery);
    }

    /**
     * 跳转到添加角色页面
     * @param model
     * @return
     */
    @RequestMapping(value = "/toAddRole", method = RequestMethod.GET)
    @ApiOperation(value = "跳转到添加角色页面")
    public String toAddRole(Model model) {
        return "role/add_role";
    }

    /**
     * 添加新角色
     * @param roleDto
     * @return
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @ApiOperation(value = "添加新角色")
    @ResponseBody
    public String insertRole(@Valid RoleDto roleDto)
    {
        return roleService.insertRole(roleDto);
    }

    /**
     * 修改角色信息
     * @param roleDto
     * @return
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ApiOperation(value = "修改角色信息")
    @ResponseBody
    public String updateRole(@Valid RoleDto roleDto)
    {
        return roleService.updateRole(roleDto);
    }

    /**
     * 启用/禁用角色
     * @param roleDto
     * @return
     */
    @RequestMapping(value = "/change", method = RequestMethod.POST)
    @ApiOperation(value = "启用/禁用角色")
    @ResponseBody
    public String changeRole(RoleDto roleDto) {
        return roleService.changeRole(roleDto);
    }
}
