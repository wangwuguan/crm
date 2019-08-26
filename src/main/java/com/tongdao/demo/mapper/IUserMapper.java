package com.tongdao.demo.mapper;

import com.tongdao.demo.entity.dto.UserDto;
import com.tongdao.demo.entity.query.UserQuery;
import com.tongdao.demo.entity.vo.UserVo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @program: crm
 * @description: 用户管理
 * @author: Wang.will
 * @create: 2019-08-13
 */
@Mapper
public interface IUserMapper {

    String INSERT = "user_id,user_name,user_phone,user_sex,user_birthday,user_role_id,create_time";
    String INSERT_PROPERTY = "#{userId},#{userName},#{userPhone},#{userSex},#{userBirthday},#{userRoleId},now()";
    String UPDATE = "user_name=#{userName},user_phone=#{userPhone},user_birthday=#{userBirthday},user_sex=#{userSex},user_role_id=#{userRoleId}";

    List<UserVo> listUser(UserQuery userQuery);

    int countUser(UserQuery userQuery);

    List<UserVo> listBirthdayDayAfter();

    @Insert("insert into user (" + INSERT + ") value(" + INSERT_PROPERTY + ")" )
    int insertUser(UserDto user);

    @Update("update user set "+ UPDATE + " where user_id = #{userId}")
    int updateUser(UserDto user);

    @Update("update user set user_state = 0 where user_id = #{userId}")
    int delUser(UserDto user);

    List<UserVo> dataBirthdayMonths();
}
