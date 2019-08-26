package com.tongdao.demo.entity.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @Author: will.Wang
 * @Version: V-1.0
 * @Date: 2019/8/18 12:38
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MenuDto {
    /**
     * id
     */
    @ApiModelProperty(value = "自增id", required = false, hidden = true)
    private Integer id;
    /**
     * 菜单id(自增)
     */
    @ApiModelProperty(value = "自增id", required = false, hidden = true)
    private Integer menuId;
    /**
     * 菜单名称
     */
    @NotBlank(message = "菜单名称不能为空")
    @Size(min = 2, message = "菜单名称至少需要两位")
    @Pattern(regexp = "^[a-zA-Z0-9_\\u4e00-\\u9fa5\\s·]+$", message = "菜单名称不能有特殊字符")
    @ApiModelProperty(value = "菜单名称", required = true)
    private String title;
    /**
     * 菜单上级id
     */
    @NotNull(message = "菜单上级不能为空")
    @ApiModelProperty(value = "角色名称", required = true)
    private Integer menuBelongId;
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
