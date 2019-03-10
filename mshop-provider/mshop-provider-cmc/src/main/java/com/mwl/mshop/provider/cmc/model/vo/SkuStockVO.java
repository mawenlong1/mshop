package com.mwl.mshop.provider.cmc.model.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author mawenlong
 * @date 2019-03-10 21:33
 */
@Data
public class SkuStockVO {
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
    private List<String> sps;

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
