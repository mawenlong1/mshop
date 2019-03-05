package com.mwl.mshop.provider.cmc.model.dto;

import lombok.Data;

/**
 * @author mawenlong
 * @date 2019/03/05
 * <p>
 * 商品属性分类:内存
 */
@Data
public class CommodityAttributeCategoryVO {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 属性数量
     */
    private Integer attributeCount;

    /**
     * 参数数量
     */
    private Integer paramCount;


}