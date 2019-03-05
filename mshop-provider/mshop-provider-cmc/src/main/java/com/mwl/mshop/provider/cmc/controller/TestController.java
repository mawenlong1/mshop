package com.mwl.mshop.provider.cmc.controller;

import com.mwl.mshop.provider.cmc.mapper.CmcBrandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mawenlong
 * @date 2019/03/05
 */
@RestController
public class TestController {

    @Autowired
    private CmcBrandMapper brandMapper;

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public String getBrand(@PathVariable Long id) {
        return brandMapper.selectByPrimaryKey(id).toString();
    }
}
