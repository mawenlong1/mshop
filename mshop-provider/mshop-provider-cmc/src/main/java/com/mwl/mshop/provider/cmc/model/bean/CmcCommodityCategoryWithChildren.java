package com.mwl.mshop.provider.cmc.model.bean;

import lombok.Data;

import java.util.List;

/**
 * @author mawenlong
 * @date 2019-03-10 23:11
 */
@Data
public class CmcCommodityCategoryWithChildren extends CmcCommodityCategory {
    private List<CmcCommodityCategory> children;
}
