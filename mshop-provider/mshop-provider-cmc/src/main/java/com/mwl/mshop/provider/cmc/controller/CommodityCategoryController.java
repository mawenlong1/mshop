package com.mwl.mshop.provider.cmc.controller;

import com.mwl.mshop.provider.cmc.model.bean.CmcCommodityCategoryWithChildren;
import com.mwl.mshop.provider.cmc.model.vo.ResultVO;
import com.mwl.mshop.provider.cmc.service.CommodityCategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author mawenlong
 * @date 2019-03-10 23:15
 */
@RestController
@RequestMapping("commodityCategory")
@Api(tags = "CommodityCategoryController", description = "商品分类")
public class CommodityCategoryController {

    @Autowired
    private CommodityCategoryService commodityCategoryService;

    @ApiOperation("查询所有一级分类及子分类")
    @RequestMapping(value = "/list/withChildren", method = RequestMethod.GET)
    @ResponseBody
    public Object listWithChildren() {
        List<CmcCommodityCategoryWithChildren> list = commodityCategoryService.listWithChildren();
        return new ResultVO().success(list);
    }

}
