package com.mwl.mshop.provider.cmc.controller;

import com.mwl.mshop.provider.cmc.model.vo.CommodityVO;
import com.mwl.mshop.provider.cmc.model.vo.PageResult;
import com.mwl.mshop.provider.cmc.model.vo.ResultVO;
import com.mwl.mshop.provider.cmc.service.CommodityService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mawenlong
 * @date 2019-03-10 14:41
 */
@RestController
@Api(tags = "CommodityController", description = "商品管理")
@RequestMapping("commodity")
public class CommodityController {

    @Autowired
    private CommodityService commodityService;

    @ApiOperation("分页查询商品")
    @RequestMapping(value = "list", method = RequestMethod.GET)
    @ResponseBody
    public ResultVO list(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                       @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        PageResult data = commodityService.list(pageNum, pageSize);
        return new ResultVO().success(data);
    }

    @ApiOperation("创建商品")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public ResultVO create(@RequestBody CommodityVO commodityVO) {
        if (commodityService.create(commodityVO)) {
            return new ResultVO().success();
        } else {
            return new ResultVO().failed("创建失败！！！");
        }
    }

}
