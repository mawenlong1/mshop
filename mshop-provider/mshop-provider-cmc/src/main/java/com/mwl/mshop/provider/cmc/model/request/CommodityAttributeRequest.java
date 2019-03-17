package com.mwl.mshop.provider.cmc.model.request;

import lombok.Data;

/**
 * @author mawenlong
 * @date 2019-03-17 15:20
 */
@Data
public class CommodityAttributeRequest {

    private Long commodityAttributeCategoryId;
    private String name;
    private Integer selectType;
    private Integer inputType;
    private String inputList;
    private Integer sort;
    private Integer filterType;
    private Integer searchType;
    private Integer relatedStatus;
    private Integer handAddStatus;
    private Integer type;
}
