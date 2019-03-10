package com.mwl.mshop.provider.cmc.service;

import com.mwl.mshop.provider.cmc.model.bean.CmcCommodityCategoryWithChildren;

import java.util.List;

/**
 * @author mawenlong
 * @date 2019-03-10 23:10
 */
public interface CommodityCategoryService {

    List<CmcCommodityCategoryWithChildren> listWithChildren();

}
