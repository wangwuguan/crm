package com.tongdao.demo.entity.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.util.Date;

/**
 * @Author: will.Wang
 * @Version: V-1.0
 * @Date: 2019/8/18 12:36
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    /**
     * 自增id
     */
    @ApiModelProperty(value = "自增id", required = false, hidden = true)
    private Integer id;
    /**
     * 用户id
     */
    @ApiModelProperty(value = "用户id", required = false, hidden = true)
    private String userId;
    /**
     * 用户名
     */
    @NotBlank(message = "用户名不能为空")
    @Size(min = 2, message = "用户名至少需要两位")
    @Pattern(regexp = "^[a-zA-Z0-9_\\u4e00-\\u9fa5\\s·]+$", message = "名称不能有特殊字符")
    @ApiModelProperty(value = "用户名", required = true)
    private String userName;
    /**
     * 用户手机号
     */
    @NotBlank(message = "用户手机号不能为空")
    @ApiModelProperty(value = "用户手机号", required = true)
    @Pattern(regexp = "^1[2-9][0-9]\\d{4,8}$", message = "请输入正确的手机号")
    private String userPhone;
    /**
     * 用户生日
     */
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Past(message = "用户生日需在当前时间之前")
    @ApiModelProperty(value = "用户生日", required = true)
    private Date userBirthday;
    /**
     * 用户性别
     */
    @NotNull
    @ApiModelProperty(value = "用户性别", required = true)
    private Integer userSex;
    /**
     * 用户角色id
     */
    @NotNull
    @ApiModelProperty(value = "用户角色id", required = true)
    private Integer userRoleId;
    /**
     * 用户状态
     */
    @ApiModelProperty(value = "用户状态", required = false, hidden = true)
    private Integer userState;
    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", required = false, hidden = true)
    private String createTime;
    /**
     * 修改时间
     */
    @ApiModelProperty(value = "修改时间", required = false, hidden = true)
    private String updateTime;

}
