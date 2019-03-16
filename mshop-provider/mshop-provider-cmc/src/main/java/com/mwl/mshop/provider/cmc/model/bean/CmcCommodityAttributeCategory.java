package com.mwl.mshop.provider.cmc.model.bean;

import lombok.Data;

/**
 * @author mawenlong
 * @date 2019/03/05
 * <p>
 * 商品属性分类：手机/服装/配件
 */
@Data
public class CmcCommodityAttributeCategory {
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
    private Integer attributeCount = 0;

    /**
     * 参数数量
     */
    private Integer paramCount = 0;


}