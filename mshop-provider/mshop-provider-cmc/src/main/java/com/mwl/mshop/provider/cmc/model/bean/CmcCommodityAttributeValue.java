package com.mwl.mshop.provider.cmc.model.bean;

import com.mwl.mshop.provider.cmc.model.dto.CommodityAttributeVO;
import com.mwl.mshop.provider.cmc.model.dto.CommodityVO;
import lombok.Data;

/**
 * @author mawenlong
 * @date 2019/03/05
 * <p>
 * 商品属性值：手机(商品对应的CmcCommodityAttributeCategory)  系统(commodityAttributeVO)  Android(value)
 */
@Data
public class CmcCommodityAttributeValue {
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