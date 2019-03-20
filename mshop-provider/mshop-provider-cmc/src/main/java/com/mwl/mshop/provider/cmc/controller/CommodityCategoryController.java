package com.mwl.mshop.provider.cmc.controller;

import com.mwl.mshop.provider.cmc.model.bean.CmcCommodityCategoryWithChildren;
import com.mwl.mshop.provider.cmc.model.vo.CommodityCategoryVO;
import com.mwl.mshop.provider.cmc.model.vo.PageResult;
import com.mwl.mshop.provider.cmc.model.vo.ResultVO;
import com.mwl.mshop.provider.cmc.service.CommodityCategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
    public ResultVO listWithChildren() {
        List<CmcCommodityCategoryWithChildren> list = commodityCategoryService.listWithChildren();
        return new ResultVO().success(list);
    }


    @ApiOperation("分页查询商品分类")
    @RequestMapping(value = "/list/{parentId}", method = RequestMethod.GET)
    @ResponseBody
    public ResultVO list(@PathVariable Long parentId,
                         @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                         @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        PageResult pageResult = commodityCategoryService.getList(parentId, pageSize, pageNum);
        return new ResultVO().success(pageResult);
    }

    @ApiOperation("修改导航栏显示状态")
    @RequestMapping(value = "/update/navStatus", method = RequestMethod.POST)
    @ResponseBody
    public ResultVO updateNavStatus(@RequestParam("ids") List<Long> ids, @RequestParam("navStatus") Integer navStatus) {
        if (commodityCategoryService.updateNavStatus(ids, navStatus)) {
            return new ResultVO().success();
        } else {
            return new ResultVO().failed();
        }
    }

    @ApiOperation("修改显示状态")
    @RequestMapping(value = "/update/showStatus", method = RequestMethod.POST)
    @ResponseBody
    public ResultVO updateShowStatus(@RequestParam("ids") List<Long> ids,
                                     @RequestParam("showStatus") Integer showStatus) {
        if (commodityCategoryService.updateShowStatus(ids, showStatus)) {
            return new ResultVO().success();
        } else {
            return new ResultVO().failed();
        }
    }

    @ApiOperation("删除商品分类")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    @ResponseBody
    public ResultVO delete(@PathVariable Long id) {
        if (commodityCategoryService.delete(id)) {
            return new ResultVO().success();
        } else {
            return new ResultVO().failed();
        }
    }

    @ApiOperation("根据id获取商品分类")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResultVO getItem(@PathVariable Long id) {
        CommodityCategoryVO productCategory = commodityCategoryService.getById(id);
        return new ResultVO().success(productCategory);
    }

    @ApiOperation("修改商品分类")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public ResultVO update(@PathVariable Long id, @RequestBody CommodityCategoryVO commodityCategoryVO) {
        if (commodityCategoryService.update(id, commodityCategoryVO)) {
            return new ResultVO().success();
        } else {
            return new ResultVO().failed();
        }
    }
}
