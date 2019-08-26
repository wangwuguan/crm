package com.tongdao.demo.controller;

import com.tongdao.demo.entity.dto.MenuDto;
import com.tongdao.demo.entity.query.MenuQuery;
import com.tongdao.demo.entity.vo.MenuVo;
import com.tongdao.demo.entity.vo.PageResultVo;
import com.tongdao.demo.service.IMenuService;
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
 * @description: 菜单管理控制类
 * @author: Wang.will
 * @create: 2019-08-14
 */
@Controller
@RequestMapping("/menu")
@Api(tags="菜单管理")
public class MenuController {

    @Autowired
    private IMenuService menuService;

    /**
     * 跳转到菜单页面
     * @param model
     * @return
     */
    @RequestMapping(value = "/toAdmin",method = RequestMethod.GET)
    @ApiOperation(value = "跳转到菜单页面")
    public String toAdmin(Model model) {
        return "main/admin";
    }

    /**
     * 查询后台界面菜单(树形)
     * @return
     */
    @RequestMapping("/tree")
    @ApiOperation(value = "询后台界面菜单(树形)")
    @ResponseBody
    public List<MenuVo> menuTree() {
        return menuService.menuTree();
    }

    /**
     * 查询所有菜单列表
     * @return
     */
    @RequestMapping(value = "/all",method = RequestMethod.POST)
    @ApiOperation(value = "查询所有菜单列表")
    @ResponseBody
    public List<MenuVo> menuListAll() {
        return menuService.menuListAll();
    }

    /**
     * 跳转到菜单列表展示页面
     * @param model
     * @return
     */
    @RequestMapping(value = "/toMenu")
    @ApiOperation(value = "跳转到菜单列表展示页面")
    public String toMenuList(Model model) {
        return "menu/menu";
    }

    /**
     * 查询全部菜单(分页)
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    @ApiOperation(value = "查询全部菜单(分页)")
    @ResponseBody
    public PageResultVo<Object> listMenu(MenuQuery menuQuery) {
        return menuService.listMenu(menuQuery);
    }

    /**
     * 跳转到添加菜单页面
     * @param model
     * @return
     */
    @RequestMapping("/toAddMenu")
    @ApiOperation(value = "跳转到添加菜单页面")
    public String toAddMenu(Model model) {
        return "menu/add_menu";
    }

    /**
     * 添加新菜单
     * @param menuDto
     * @return
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @ApiOperation(value = "添加新菜单")
    @ResponseBody
    public String insertMenu(@Valid MenuDto menuDto)
    {
        return menuService.insertMenu(menuDto);
    }

    /**
     * 修改菜单信息
     * @param menuDto
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation(value = "修改菜单信息")
    @ResponseBody
    public String updateMenu(@Valid MenuDto menuDto)
    {
        return menuService.updateMenu(menuDto);
    }

    /**
     * 删除菜单
     * @param menuId
     * @return
     */
    @RequestMapping("/del")
    @ApiOperation(value = "删除菜单")
    @ResponseBody
    public String delMenu(Integer menuId) {
        return menuService.delMenu(menuId);
    }

}
