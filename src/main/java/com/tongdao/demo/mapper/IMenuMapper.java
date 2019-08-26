package com.tongdao.demo.mapper;

import com.tongdao.demo.entity.dto.MenuDto;
import com.tongdao.demo.entity.query.MenuQuery;
import com.tongdao.demo.entity.vo.MenuVo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: crm
 * @description:
 * @author: Wang.will
 * @create: 2019-08-14
 */
@Mapper
public interface IMenuMapper {

    String INSERT = "title,menu_belong_id,create_time";
    String INSERT_PROPERTY = "#{title},#{menuBelongId},now()";
    String UPDATE = "title=#{title},menu_belong_id=#{menuBelongId}";

    ArrayList<MenuVo> menuListAll();

    List<MenuVo> listMenu(MenuQuery menuQuery);

    int countMenu(MenuQuery menuQuery);

    @Insert("insert into menu (" + INSERT + ") value(" + INSERT_PROPERTY + ")" )
    int insertMenu(MenuDto menuDto);

    @Update("update menu set "+ UPDATE + " where menu_id = #{menuId}")
    int updateMenu(MenuDto menuDto);

    @Delete("delete from menu where menu_id = #{menuId}")
    int delMenu(Integer menuId);
}
