package com.mwl.mshop.provider.cmc.service.impl;

import com.github.pagehelper.PageHelper;
import com.mwl.mshop.provider.cmc.mapper.CmcCommodityAttributeMapper;
import com.mwl.mshop.provider.cmc.model.bean.CmcCommodityAttribute;
import com.mwl.mshop.provider.cmc.model.bean.CmcCommodityAttributeExample;
import com.mwl.mshop.provider.cmc.service.CommodityAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mawenlong
 * @date 2019-03-10 19:06
 */
@Service
public class CommodityAttributeServiceImpl implements CommodityAttributeService {

    @Autowired
    private CmcCommodityAttributeMapper commodityAttributeMapper;


    @Override
    public List<CmcCommodityAttribute> getList(Long cid, Integer type, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        CmcCommodityAttributeExample example = new CmcCommodityAttributeExample();
        example.setOrderByClause("sort desc");
        example.createCriteria().andCommodityAttributeCategoryIdEqualTo(cid).andTypeEqualTo(type);
        return commodityAttributeMapper.selectByExample(example);
    }
}
