package com.tongdao.demo.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserVo {
    /**
     * 自增id
     */
    private Integer id;
    /**
     * 用户id
     */
    private String userId;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 用户手机号
     */
    private String userPhone;
    /**
     * 用户生日
     */
    private String userBirthday;
    /**
     * 用户性别
     */
    private Integer userSex;
    /**
     * 用户角色id
     */
    private Integer userRoleId;
    /**
     * 用户状态
     */
    private Integer userState;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 修改时间
     */
    private String updateTime;

    /**
     * 月份
     */
    private String month;
    /**
     * 数量
     */
    private String num;
}
