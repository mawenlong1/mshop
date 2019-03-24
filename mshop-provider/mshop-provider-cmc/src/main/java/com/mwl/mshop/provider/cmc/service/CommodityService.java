package com.mwl.mshop.provider.cmc.service;

import com.mwl.mshop.provider.cmc.model.vo.CommodityVO;
import com.mwl.mshop.provider.cmc.model.vo.PageResult;

/**
 * @author mawenlong
 * @date 2019-03-10 15:06
 */
public interface CommodityService {

    PageResult list(Integer pageNum, Integer pageSize);

    boolean create(CommodityVO commodityVO);

    boolean update(Long id, CommodityVO commodityVO);
}
