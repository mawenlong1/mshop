package com.mwl.mshop.provider.cmc.controller;

import com.mwl.mshop.provider.cmc.model.vo.PageResult;
import com.mwl.mshop.provider.cmc.model.vo.ResultVO;
import com.mwl.mshop.provider.cmc.service.CommodityAttributeCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mawenlong
 * @date 2019-03-16 21:46
 */
@RestController
@RequestMapping("/commodityAttribute/category")
public class CommodityAttributeCategoryController {

    @Autowired
    private CommodityAttributeCategoryService categoryService;

    @RequestMapping("list")
    @ResponseBody
    public ResultVO list(@RequestParam(defaultValue = "5") Integer pageSize,
                         @RequestParam(defaultValue = "1") Integer pageNum) {
        PageResult result = categoryService.list(pageSize, pageNum);
        return new ResultVO().success(result);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public ResultVO update(@PathVariable Long id, @RequestParam String name) {

        if (categoryService.update(id, name)) {
            return new ResultVO().success();
        } else {
            return new ResultVO().failed();
        }
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResultVO delete(@PathVariable Long id) {
        if (categoryService.delete(id)) {
            return new ResultVO().success();
        } else {
            return new ResultVO().failed("删除失败");
        }
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public Object create(@RequestParam String name) {
        if (categoryService.create(name)) {
            return new ResultVO().success();
        } else {
            return new ResultVO().failed("创建失败");
        }
    }

}
