package com.mwl.mshop.provider.cmc.controller;

import com.mwl.mshop.provider.cmc.model.bean.CmcCommodity;
import com.mwl.mshop.provider.cmc.model.vo.ResultVO;
import com.mwl.mshop.provider.cmc.service.CommodityService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author mawenlong
 * @date 2019-03-10 14:41
 */
@RestController
@Api(tags = "PmsProductController", description = "商品管理")
@RequestMapping("product")
public class PruductController {

    @Autowired
    private CommodityService commodityService;

    @ApiOperation("分页查询商品")
    @RequestMapping(value = "list", method = RequestMethod.GET)
    @ResponseBody
    public Object list(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                       @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        List<CmcCommodity> data = commodityService.list(pageNum, pageSize);

        return new ResultVO().pageSuccess(data);
    }

}
