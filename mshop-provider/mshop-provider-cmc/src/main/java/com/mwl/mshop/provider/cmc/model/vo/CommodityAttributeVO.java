package com.mwl.mshop.provider.cmc.model.vo;

import lombok.Data;

/**
 * @author mawenlong
 * @date 2019/03/05
 * <p>
 * 商品属性：16-32G
 */
@Data
public class CommodityAttributeVO {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 商品属性分类id
     */
    private CommodityAttributeCategoryVO commodityAttributeCategoryVO;

    /**
     * 名称
     */
    private String name;

    /**
     * 属性选择类型
     */
    private Integer selectType;

    /**
     * 属性录入方式
     */
    private Integer inputType;

    /**
     * 可选值列表，以"，"分割
     */
    private String inputList;

    /**
     * 排序字段
     */
    private Integer sort;

    /**
     * 分类筛选样式：1->普通；1->颜色
     */
    private Integer filterType;

    /**
     * 检索类型；0->不需要进行检索；1->关键字检索；2->范围检索
     */
    private Integer searchType;

    /**
     * 相同属性产品是否关联；0->不关联；1->关联
     */
    private Integer relatedStatus;

    /**
     * 是否支持手动新增；0->不支持；1->支持
     */
    private Integer handAddStatus;

    /**
     * 属性的类型；0->规格；1->参数
     */
    private Integer type;

}