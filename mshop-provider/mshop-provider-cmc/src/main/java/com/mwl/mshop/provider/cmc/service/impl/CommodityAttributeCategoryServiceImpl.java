package com.mwl.mshop.provider.cmc.service.impl;

import com.github.pagehelper.PageHelper;
import com.mwl.mshop.provider.cmc.mapper.CmcCommodityAttributeCategoryMapper;
import com.mwl.mshop.provider.cmc.model.bean.CmcCommodityAttributeCategory;
import com.mwl.mshop.provider.cmc.model.bean.CmcCommodityAttributeCategoryExample;
import com.mwl.mshop.provider.cmc.model.vo.PageResult;
import com.mwl.mshop.provider.cmc.service.CommodityAttributeCategoryService;
import com.mwl.mshop.provider.cmc.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mawenlong
 * @date 2019-03-16 21:50
 */
@Service
public class CommodityAttributeCategoryServiceImpl implements CommodityAttributeCategoryService {

    @Autowired
    private CmcCommodityAttributeCategoryMapper attributeCategoryMapper;

    @Override
    public PageResult list(Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        List<CmcCommodityAttributeCategory> attributeCategories =
                attributeCategoryMapper.selectByExample(new CmcCommodityAttributeCategoryExample());
        return PageUtils.convertPageData(attributeCategories);
    }
}
