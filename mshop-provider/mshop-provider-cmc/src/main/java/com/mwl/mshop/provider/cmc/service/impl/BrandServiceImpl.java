package com.mwl.mshop.provider.cmc.service.impl;

import com.github.pagehelper.PageHelper;
import com.mwl.mshop.provider.cmc.mapper.CmcBrandMapper;
import com.mwl.mshop.provider.cmc.model.bean.CmcBrand;
import com.mwl.mshop.provider.cmc.model.bean.CmcBrandExample;
import com.mwl.mshop.provider.cmc.model.vo.PageResult;
import com.mwl.mshop.provider.cmc.service.BrandService;
import com.mwl.mshop.provider.cmc.utils.PageUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mawenlong
 * @date 2019-03-06 23:54
 */
@Slf4j
@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private CmcBrandMapper brandMapper;

    public String getNameById(Long id) {
        CmcBrand brand = brandMapper.selectByPrimaryKey(id);
        return brand.getName();
    }

    @Override
    public PageResult list(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<CmcBrand> cmcBrandList = brandMapper.selectByExample(new CmcBrandExample());

        return PageUtils.convertPageData(cmcBrandList, cmcBrandList);
    }
}
