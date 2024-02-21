package com.jq.data.example.mapping.package3;


import com.jq.data.collect.enums.DataTypeEnum;
import com.jq.data.collect.enums.SourceTypeEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author 18870
 * @since 2023-05-27
 */
@Data
public class Metadata implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 规则表主键id
     */
    private Long ruleId;

    /**
     * 指标英文标识
     */
    private String enName;

    /**
     * 指标中文标识
     */
    private String cnName;

    /**
     * 指标默认是否展示
     */
    private Boolean defaultShow;

    /**
     * 是否存储当前指标
     */
    private Boolean storage;

    /**
     * 当前指标是否和维度有关
     */
    private Boolean dimension;

    /**
     * 当前指标是否和统计周期有关
     */
    private Boolean period;

    /**
     * 指标数据类型
     */
    private DataTypeEnum dataType;

    /**
     * 指标类型：1抽取类型 2计算类型
     */
    private SourceTypeEnum sourceType;

    /**
     * 生命周期规则id
     */
    private Integer lifeCycleRuleId;

    /**
     * 跟踪的UUID
     */
    private String traceId;

    /**
     * 数据安全信息字段id
     */
    private Integer dataSecurity;

    /**
     * 前端展示宽度
     */
    private Integer extraWidth;

    /**
     * 指标描述
     */
    private String description;

    /**
     * 指标排序
     */
    private Integer rank;

    /**
     * 基准值，用来做展示数据
     */
    private Integer baseValue;

}
