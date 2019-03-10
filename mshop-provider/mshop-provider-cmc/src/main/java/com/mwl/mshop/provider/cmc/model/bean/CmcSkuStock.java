package com.mwl.mshop.provider.cmc.model.bean;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CmcSkuStock {
    /**
     * 主键
     */
    private Long id;

    /**
     * 商品id
     */
    private Long productId;

    /**
     * sku代码
     */
    private String skuCode;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 预警库存
     */
    private Integer lowStock;

    /**
     * 商品属性（以"，"分开）
     */
    private String sps;

    /**
     * 图片
     */
    private String pic;

    /**
     * 销量
     */
    private Integer sale;

    /**
     * 锁定库存
     */
    private Integer lockStock;
}