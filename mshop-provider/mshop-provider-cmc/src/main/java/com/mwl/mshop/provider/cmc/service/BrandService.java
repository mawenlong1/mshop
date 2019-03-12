package com.mwl.mshop.provider.cmc.service;

import com.mwl.mshop.provider.cmc.model.vo.PageResult;

/**
 * @author mawenlong
 * @date 2019-03-06 23:51
 */
public interface BrandService {

    String getNameById(Long id);

    PageResult list(String keyword,Integer pageNum, Integer pageSize);

    Boolean updateShowStatus(Long id, Integer showStatus);

    Boolean updateFactoryStatus(Long id, Integer factoryStatus);

    Boolean deleteBrand(Long id);
}