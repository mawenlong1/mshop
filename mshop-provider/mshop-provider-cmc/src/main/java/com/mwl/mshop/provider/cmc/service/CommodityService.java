package com.mwl.mshop.provider.cmc.service;

import com.mwl.mshop.provider.cmc.model.bean.CmcCommodity;

import java.util.List;

/**
 * @author mawenlong
 * @date 2019-03-10 15:06
 */
public interface CommodityService {

    List<CmcCommodity> list(Integer pageNum, Integer pageSize);
}
