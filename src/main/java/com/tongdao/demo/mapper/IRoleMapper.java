package com.tongdao.demo.mapper;

import com.tongdao.demo.entity.dto.RoleDto;
import com.tongdao.demo.entity.query.RoleQuery;
import com.tongdao.demo.entity.vo.RoleVo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @program: crm
 * @description:
 * @author: Wang.will
 * @create: 2019-08-15
 */
@Mapper
public interface IRoleMapper {

    String INSERT = "role_name,role_describe,create_time";
    String INSERT_PROPERTY = "#{roleName},#{roleDescribe},now()";
    String UPDATE = "role_name=#{roleName},role_describe=#{roleDescribe}";

    List<RoleVo> listRoleAll();

    List<RoleVo> listRole(RoleQuery roleQuery);

    int countRole(RoleQuery roleQuery);

    @Insert("insert into role (" + INSERT + ") value(" + INSERT_PROPERTY + ")" )
    int insertRole(RoleDto roleDto);

    @Update("update role set "+ UPDATE + " where role_id = #{roleId}")
    int updateRole(RoleDto roleDto);

    @Update("update role set role_state = #{roleState} where role_id = #{roleId}")
    int changeRole(RoleDto roleDto);
}
