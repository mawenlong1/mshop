package com.mwl.mshop.provider.cmc.model.vo;

import lombok.Data;

/**
 * @author mawenlong
 * @date 2019/03/05
 * <p>
 * 商品分类
 */
@Data
public class CommodityCategoryVO {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 上一级分类id
     */
    private CommodityCategoryVO parentId;

    /**
     * 名称
     */
    private String name;

    /**
     * 分类级别
     */
    private Integer level;

    /**
     * 商品数量
     */
    private Integer commodityCount;

    /**
     * 商品单位
     */
    private String commodityUnit;

    /**
     * 是否显示在导航栏：
     */
    private Integer navStatus;

    /**
     * 显示状态：0->不显示；1->显示
     */
    private Integer showStatus;

    /**
     * 排序字段
     */
    private Integer sort;

    /**
     * 图标
     */
    private String icon;

    /**
     * 关键词
     */
    private String keywords;

    /**
     * 描述
     */
    private String description;

}