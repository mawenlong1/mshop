package com.mwl.mshop.provider.cmc.service;

import com.mwl.mshop.provider.cmc.model.bean.CmcCommodityAttribute;

import java.util.List;

/**
 * @author mawenlong
 * @date 2019-03-10 19:06
 */
public interface CommodityAttributeService {

    List<CmcCommodityAttribute> getList(Long cid, Integer type, Integer pageSize, Integer pageNum);
}
