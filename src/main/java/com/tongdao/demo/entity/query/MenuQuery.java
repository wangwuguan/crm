package com.tongdao.demo.entity.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: will.Wang
 * @Version: V-1.0
 * @Date: 2019/8/18 12:30
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MenuQuery extends PageQuery{
    /**
     * 菜单名称
     */
    private String title;
}
