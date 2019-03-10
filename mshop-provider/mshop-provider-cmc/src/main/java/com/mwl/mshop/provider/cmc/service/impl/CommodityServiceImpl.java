package com.mwl.mshop.provider.cmc.service.impl;

import com.github.pagehelper.PageHelper;
import com.mwl.mshop.provider.cmc.mapper.CmcCommodityMapper;
import com.mwl.mshop.provider.cmc.model.bean.CmcCommodity;
import com.mwl.mshop.provider.cmc.model.bean.CmcCommodityExample;
import com.mwl.mshop.provider.cmc.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mawenlong
 * @date 2019-03-10 15:06
 */
@Service
public class CommodityServiceImpl implements CommodityService {

    @Autowired
    private CmcCommodityMapper commodityMapper;


    @Override
    public List<CmcCommodity> list(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        CmcCommodityExample example = new CmcCommodityExample();
        List<CmcCommodity> res = commodityMapper.selectByExample(example);

        return res;
    }
}
