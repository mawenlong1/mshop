package com.mwl.mshop.provider.cmc.service;

import com.mwl.mshop.provider.cmc.model.vo.SkuStockVO;

import java.util.List;

/**
 * @author mawenlong
 * @date 2019-03-10 19:21
 */
public interface SkuStockService {

    List<SkuStockVO> getList(Long pid, String keyword);

}
