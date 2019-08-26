package com.tongdao.demo.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: crm
 * @description: 菜单类
 * @author: Wang.will
 * @create: 2019-08-14
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MenuVo {
    /**
     * id
     */
    private Integer id;
    /**
     * 菜单id(自增)
     */
    private Integer menuId;
    /**
     * 菜单名称
     */
    private String title;
    /**
     * 菜单上级id
     */
    private Integer menuBelongId;
    /**
     * 路径
     */
    private String href;
    /**
     * 菜单的子菜单
     */
    private List<MenuVo> children = new ArrayList<>();
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 修改时间
     */
    private String updateTime;

}
