package com.mwl.mshop.provider.cmc.mapper.dao;

import com.mwl.mshop.provider.cmc.model.bean.CmcCommodityCategoryWithChildren;

import java.util.List;

/**
 * @author mawenlong
 * @date 2019-03-10 23:13
 */
public interface CmcCommodityCategoryDao {
    List<CmcCommodityCategoryWithChildren> listWithChildren();
}
