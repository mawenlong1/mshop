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
import org.springframework.util.StringUtils;

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
    public PageResult list(String keyword, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        CmcBrandExample example = new CmcBrandExample();
        example.setOrderByClause("sort desc");
        CmcBrandExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andNameLike("%" + keyword + "%");
        }
        List<CmcBrand> cmcBrandList = brandMapper.selectByExample(example);
        return PageUtils.convertPageData(cmcBrandList, cmcBrandList);
    }

    @Override
    public Boolean updateShowStatus(Long id, Integer showStatus) {
        CmcBrand brand = new CmcBrand();
        brand.setShowStatus(showStatus);
        CmcBrandExample example = new CmcBrandExample();
        example.createCriteria().andIdEqualTo(id);
        return brandMapper.updateByExampleSelective(brand, example) == 1;
    }

    @Override
    public Boolean updateFactoryStatus(Long id, Integer factoryStatus) {
        CmcBrand brand = new CmcBrand();
        brand.setFactoryStatus(factoryStatus);
        CmcBrandExample brandExample = new CmcBrandExample();
        brandExample.createCriteria().andIdEqualTo(id);
        return brandMapper.updateByExampleSelective(brand, brandExample) == 1;
    }

    @Override
    public Boolean deleteBrand(Long id) {
        return brandMapper.deleteByPrimaryKey(id) == 1;
    }
}
