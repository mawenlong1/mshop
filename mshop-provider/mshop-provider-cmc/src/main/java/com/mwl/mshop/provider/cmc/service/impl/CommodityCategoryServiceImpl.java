package com.mwl.mshop.provider.cmc.service.impl;

import com.mwl.mshop.provider.cmc.mapper.dao.CmcCommodityCategoryDao;
import com.mwl.mshop.provider.cmc.model.bean.CmcCommodityCategoryWithChildren;
import com.mwl.mshop.provider.cmc.service.CommodityCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mawenlong
 * @date 2019-03-10 23:10
 */
@Service
public class CommodityCategoryServiceImpl implements CommodityCategoryService {

    @Autowired
    private CmcCommodityCategoryDao productCategoryDao;

    @Override
    public List<CmcCommodityCategoryWithChildren> listWithChildren() {
        return productCategoryDao.listWithChildren();
    }
}
