package com.mwl.mshop.provider.cmc.service;

import com.mwl.mshop.provider.cmc.model.vo.PageResult;

/**
 * @author mawenlong
 * @date 2019-03-16 21:50
 */
public interface CommodityAttributeCategoryService {


    PageResult list(Integer pageSize, Integer PageNum);
}
