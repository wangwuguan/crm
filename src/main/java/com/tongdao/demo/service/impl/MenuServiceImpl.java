package com.tongdao.demo.service.impl;

import com.tongdao.demo.entity.dto.MenuDto;
import com.tongdao.demo.entity.query.MenuQuery;
import com.tongdao.demo.entity.vo.MenuVo;
import com.tongdao.demo.entity.vo.PageResultVo;
import com.tongdao.demo.mapper.IMenuMapper;
import com.tongdao.demo.service.IMenuService;
import com.tongdao.demo.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: crm
 * @description:
 * @author: Wang.will
 * @create: 2019-08-14
 */
@Service
public class MenuServiceImpl implements IMenuService {

    @Autowired
    private IMenuMapper menuMapper;

    @Override
    public List<MenuVo> menuTree() {
        // 获取所有符合条件的菜单集合
        ArrayList<MenuVo> menus = menuMapper.menuListAll();
        ArrayList<MenuVo> trees = (ArrayList<MenuVo>) menus.clone();

        // 定义一个返回结果的菜单集合
        List<MenuVo> menuResult = new ArrayList<MenuVo>();
        for (MenuVo menu : menus) {
            if (menu.getMenuBelongId() == 0) {
                menuResult.add(menu);
                trees.remove(menu);
            }
        }
        // 查找菜单的子菜单
        for (MenuVo parent : menuResult) {
            parent = recursiveTree(parent, trees);
        }
        return menuResult;
    }

    @Override
    public List<MenuVo> menuListAll() {
        return menuMapper.menuListAll();
    }

    @Override
    public PageResultVo<Object> listMenu(MenuQuery menuQuery) {
        PageUtil.pageAssignment(menuQuery);
        List<MenuVo> menus = menuMapper.listMenu(menuQuery);
        int countMenus = menuMapper.countMenu(menuQuery);
        return PageUtil.selectResult(countMenus, menus);
    }

    @Override
    public String insertMenu(MenuDto menuDto) {
        return PageUtil.toResult(menuMapper.insertMenu(menuDto));
    }

    @Override
    public String updateMenu(MenuDto menuDto) {
        return PageUtil.toResult(menuMapper.updateMenu(menuDto));
    }

    @Override
    public String delMenu(Integer menuId) {
        return PageUtil.toResult(menuMapper.delMenu(menuId));
    }

    /**
     * 用来获取菜单的子菜单
     * @param parent 父菜单
     * @param menus 符合要求的所有菜单集合
     * @return
     */
    public MenuVo recursiveTree(MenuVo parent, ArrayList<MenuVo> menus) {
        if (menus.size() == 0) {
            return parent;
        }
        ArrayList<MenuVo> trees = (ArrayList<MenuVo>) menus.clone();
        for (MenuVo child : menus) {
            if (parent.getMenuId() == child.getMenuBelongId()) {
                trees.remove(child);
                // 如果符合要求,获取子菜单还有没其子菜单
                child = recursiveTree(child, trees);
                // 父菜单的子菜单集合中追加其子菜单
                parent.getChildren().add(child);
            }
        }
        return parent;
    }


}
