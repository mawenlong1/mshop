package com.mwl.mshop.provider.cmc.service.impl;

import com.mwl.mshop.provider.cmc.mapper.CmcBrandMapper;
import com.mwl.mshop.provider.cmc.model.bean.CmcBrand;
import com.mwl.mshop.provider.cmc.service.BrandService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author mawenlong
 * @date 2019-03-06 23:54
 */
@Slf4j
@Service
public class BrandServiceImpl implements BrandService {

    private CmcBrandMapper brandMapper;

    public String getNameById(Long id){
        CmcBrand brand  = brandMapper.selectByPrimaryKey(id);
        return brand.getName();
    }
}
