package com.mwl.mshop.provider.cmc.controller;

import com.mwl.mshop.provider.cmc.model.vo.ResultVO;
import com.mwl.mshop.provider.cmc.model.vo.SkuStockVO;
import com.mwl.mshop.provider.cmc.service.SkuStockService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @author mawenlong
 * @date 2019-03-10 19:14
 */
@RestController
@Api(tags = "SkuStockController", description = "商品库存管理")
@RequestMapping("/sku")
public class SkuStockController {

    @Autowired
    private SkuStockService skuStockService;

    @ApiOperation("根据商品编号及编号模糊搜索sku库存")
    @RequestMapping(value = "/{pid}", method = RequestMethod.GET)
    @ResponseBody
    public Object getList(@PathVariable Long pid, @RequestParam(value = "keyword",required = false) String keyword) {
        List<SkuStockVO> skuStockList = skuStockService.getList(pid, keyword);
        return new ResultVO().pageSuccess(skuStockList);
    }

}
