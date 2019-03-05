package com.mwl.mshop.provider.cmc.controller;

import com.mwl.mshop.provider.cmc.mapper.CmcBrandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mawenlong
 * @date 2019/03/05
 */
@RestController
public class TestController {

    @Autowired
    private CmcBrandMapper brandMapper;

}
