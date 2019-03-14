package com.mwl.mshop.provider.cmc.controller;

import com.mwl.mshop.provider.cmc.model.vo.BrandVO;
import com.mwl.mshop.provider.cmc.model.vo.PageResult;
import com.mwl.mshop.provider.cmc.model.vo.ResultVO;
import com.mwl.mshop.provider.cmc.service.BrandService;
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

/**
 * @author mawenlong
 * @date 2019-03-10 22:56
 */
@RestController
@RequestMapping("brand")
@Api(tags = "CommodityController", description = "品牌管理")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @ApiOperation("添加品牌")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public ResultVO create(@RequestBody BrandVO brandVO) {
        if (brandService.createBrand(brandVO)) {
            return new ResultVO().success();
        } else {
            return new ResultVO().failed();
        }
    }

    @ApiOperation("分页查询品牌")
    @RequestMapping(value = "list", method = RequestMethod.GET)
    @ResponseBody
    public ResultVO list(@RequestParam(value = "keyword", required = false) String keyword,
                         @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                         @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        PageResult pageResult = brandService.list(keyword, pageNum, pageSize);
        return new ResultVO().success(pageResult);
    }

    @ApiOperation("更新品牌显示状态")
    @RequestMapping(value = "/update/showStatus", method = RequestMethod.POST)
    @ResponseBody
    public ResultVO updateShowStatus(@RequestParam("id") Long id, @RequestParam("showStatus") Integer showStatus) {
        if (brandService.updateShowStatus(id, showStatus)) {
            return new ResultVO().success();
        } else {
            return new ResultVO().failed();
        }
    }

    @ApiOperation("更新品牌是否为品牌制造商")
    @RequestMapping(value = "/update/factoryStatus", method = RequestMethod.POST)
    @ResponseBody
    public ResultVO updateactForyStatus(@RequestParam("id") Long id,
                                        @RequestParam("factoryStatus") Integer factoryStatus) {
        if (brandService.updateFactoryStatus(id, factoryStatus)) {
            return new ResultVO().success();
        } else {
            return new ResultVO().failed();
        }
    }

    @ApiOperation("删除品牌")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Object delete(@PathVariable("id") Long id) {
        if (brandService.deleteBrand(id)) {
            return new ResultVO().success();
        } else {
            return new ResultVO().failed();
        }
    }
}
