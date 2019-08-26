package com.tongdao.demo.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageResultVo<T> {
    /**
     * 接口状态
     */
    private Integer code = 0;
    /**
     * 提示文本
     */
    private String msg = "";
    /**
     * 数据长度
     */
    private int count;
    /**
     * 数据列表
     */
    private List<T> data;

}
