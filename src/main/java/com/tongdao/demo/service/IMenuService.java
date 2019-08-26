package com.tongdao.demo.service;

import com.tongdao.demo.entity.dto.MenuDto;
import com.tongdao.demo.entity.query.MenuQuery;
import com.tongdao.demo.entity.vo.MenuVo;
import com.tongdao.demo.entity.vo.PageResultVo;

import java.util.List;

/**
 * @program: crm
 * @description: 菜单管理
 * @author: Wang.will
 * @create: 2019-08-14
 */
public interface IMenuService {

    /**
     * 查询后台界面菜单(树形)
     * @return
     */
    List<MenuVo> menuTree();

    /**
     * 查询所有菜单列表
     * @return
     */
    List<MenuVo> menuListAll();

    /**
     * 查询全部菜单(分页)
     * @return
     */
    PageResultVo<Object> listMenu(MenuQuery menuQuery);

    /**
     * 添加新菜单
     * @param menuDto
     * @return
     */
    String insertMenu(MenuDto menuDto);

    /**
     * 修改菜单信息
     * @param menuDto
     * @return
     */
    String updateMenu(MenuDto menuDto);

    /**
     * 删除菜单
     * @param menuId
     * @return
     */
    String delMenu(Integer menuId);

}
