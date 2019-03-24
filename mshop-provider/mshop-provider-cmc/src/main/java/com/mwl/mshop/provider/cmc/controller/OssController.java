package com.mwl.mshop.provider.cmc.controller;

import com.mwl.mshop.provider.cmc.model.request.OssCallbackResult;
import com.mwl.mshop.provider.cmc.model.request.OssPolicyResult;
import com.mwl.mshop.provider.cmc.model.vo.ResultVO;
import com.mwl.mshop.provider.cmc.service.impl.OssServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author mawenlong
 * @date 2019-03-24 22:16
 */
@RestController
@Api(tags = "OssController", description = "Oss管理")
@RequestMapping("/aliyun/oss")
public class OssController {


    @Autowired
    private OssServiceImpl ossService;

    @ApiOperation("oss上传签名生成")
    @RequestMapping(value = "/policy", method = RequestMethod.GET)
    @ResponseBody
    public ResultVO policy() {
        OssPolicyResult result = ossService.policy();
        return new ResultVO().success(result);
    }

    @ApiOperation("oss上传成功回调")
    @RequestMapping(value = "callback", method = RequestMethod.POST)
    @ResponseBody
    public ResultVO callback(HttpServletRequest request) {
        OssCallbackResult ossCallbackResult = ossService.callback(request);
        return new ResultVO().success(ossCallbackResult);
    }

}
