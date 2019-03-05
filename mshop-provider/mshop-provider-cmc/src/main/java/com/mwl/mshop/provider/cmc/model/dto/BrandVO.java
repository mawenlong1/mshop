package com.mwl.mshop.provider.cmc.model.dto;

import lombok.Data;

/**
 * @author mawenlong
 * @date 2019/03/05
 * <p>
 * 商标
 */
@Data
public class BrandVO {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 商标名称
     */
    private String name;

    /**
     * 首字母
     */
    private String firstLetter;

    /**
     * 排序字段
     */
    private Integer sort;

    /**
     * 是否为品牌制造商
     */
    private Integer factoryStatus;

    /**
     * 显示状态
     */
    private Integer showStatus;

    /**
     * 商品数量
     */
    private Integer commodityCount;

    /**
     * 商品评论数
     */
    private Integer commodityCommentCount;

    /**
     * logo
     */
    private String logo;

    /**
     * 商标大图
     */
    private String bigPic;

    /**
     * 品牌故事
     */
    private String brandStory;

}