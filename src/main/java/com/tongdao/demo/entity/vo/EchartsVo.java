package com.tongdao.demo.entity.vo;

import com.tongdao.demo.util.SystemConstant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: will.Wang
 * @Version: V-1.0
 * @Date: 2019/8/17 11:03
 * @Description: Echarts数据接口
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EchartsVo {
    /**
     * 状态码
     */
    private int state = 0;
    /**
     * 信息（备注）
     */
    private String msg = SystemConstant.SUCCESS;
    /**
     * x轴对应的属性
     */
    private List<String> categories = new ArrayList<>();
    /**
     * x对应的数据
     */
    private List<String> data = new ArrayList<>();
}
