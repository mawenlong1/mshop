package com.mwl.mshop.provider.cmc.model.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author mawenlong
 * @date 2019/03/05
 * <p>
 * 商品信息
 */
@Data
public class CommodityVO {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 品牌id
     */
    private BrandVO brandVO;

    /**
     * 商品类别id
     */
    private CommodityCategoryVO commodityCategoryVO;

    /**
     * 商品属性分类id
     */
    private CommodityAttributeCategoryVO commodityAttributeCategoryVO;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品图片
     */
    private String pic;

    /**
     * 商品状态
     */
    private Byte status;

    /**
     * 销量
     */
    private Integer sale;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 赠送的成长值
     */
    private Integer giftGrowth;

    /**
     * 赠送的积分
     */
    private Integer giftPoint;

    /**
     * 子标题
     */
    private String subTitle;

    /**
     * 商品描述
     */
    private String description;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 库存告警值
     */
    private Integer lowStock;

    /**
     * 单位
     */
    private String unit;

    /**
     * 重量
     */
    private BigDecimal weight;

    /**
     * 关键词
     */
    private String keywords;

    /**
     * 相册
     */
    private String albumPics;

    /**
     * 详细标题
     */
    private String detailTitle;

    /**
     * 商品详情页内容
     */
    private String detailHtml;
}