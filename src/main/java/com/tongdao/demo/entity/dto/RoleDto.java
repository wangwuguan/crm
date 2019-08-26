package com.tongdao.demo.entity.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @Author: will.Wang
 * @Version: V-1.0
 * @Date: 2019/8/18 12:37
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleDto {
    /**
     * id
     */
    @ApiModelProperty(value = "自增id", required = false, hidden = true)
    private Integer id;
    /**
     * 角色id(自增)
     */
    @ApiModelProperty(value = "自增id", required = false, hidden = true)
    private Integer roleId;
    /**
     * 角色名称
     */
    @NotBlank(message = "角色名称不能为空")
    @Size(min = 2, message = "角色名称至少需要两位")
    @Pattern(regexp = "^[a-zA-Z0-9_\\u4e00-\\u9fa5\\s·]+$", message = "角色名称不能有特殊字符")
    @ApiModelProperty(value = "角色名称", required = true)
    private String roleName;
    /**
     * 角色描述
     */
    @ApiModelProperty(value = "角色名称")
    private String roleDescribe;
    /**
     * 角色状态
     */
    @ApiModelProperty(value = "自增id", required = false, hidden = true)
    private Integer roleState;
    /**
     * 创建时间
     */
    @ApiModelProperty(value = "自增id", required = false, hidden = true)
    private String createTime;
    /**
     * 修改时间
     */
    @ApiModelProperty(value = "自增id", required = false, hidden = true)
    private String updateTime;

}
