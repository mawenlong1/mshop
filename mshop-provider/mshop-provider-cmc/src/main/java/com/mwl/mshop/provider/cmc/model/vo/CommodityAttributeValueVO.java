package com.mwl.mshop.provider.cmc.model.vo;

import lombok.Data;

/**
 * @author mawenlong
 * @date 2019/03/05
 * <p>
 * 商品属性值
 */
@Data
public class CommodityAttributeValueVO {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 商品id
     */
    private CommodityVO commodityVO;

    /**
     * 商品属性id
     */
    private CommodityAttributeVO commodityAttributeVO;

    /**
     * 参数的值
     */
    private String value;
}