package com.mwl.mshop.provider.cmc.controller;

import com.mwl.mshop.provider.cmc.model.bean.CmcCommodityAttribute;
import com.mwl.mshop.provider.cmc.model.vo.ResultVO;
import com.mwl.mshop.provider.cmc.service.CommodityAttributeService;
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
@Api(tags = "CommodityAttributeController", description = "商品属性管理")
@RequestMapping("/commodityAttribute")
public class CommodityAttributeController {

    @Autowired
    private CommodityAttributeService commodityAttributeService;

    @ApiOperation("根据分类查询属性列表或参数列表")
    @RequestMapping(value = "/list/{cid}", method = RequestMethod.GET)
    @ResponseBody
    public Object getList(@PathVariable Long cid,
                          @RequestParam("type") Integer type,
                          @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                          @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<CmcCommodityAttribute>
                productAttributeList = commodityAttributeService.getList(cid, type, pageSize, pageNum);
        return new ResultVO().pageSuccess(productAttributeList);
    }

}
