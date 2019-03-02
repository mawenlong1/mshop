package com.mwl.mshop.provider;

import com.mwl.mshop.provider.api.ConsumeService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.Resource;

/**
 * @author mawenlong
 * @date 2019/02/25
 */
@Slf4j
@RestController
@EnableSwagger2
@Api(value = "Hello Control", description = "测试controller", tags = "Swagger Test Control Tag")
public class HelloController {

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String index() {
        System.out.println("client  =======  被调用   =======");
        return "hello";
    }

    @Autowired
    StreamClient streamClient;
    @Resource
    ConsumeService consumeService;

    @RequestMapping(value = "send", method = RequestMethod.GET)
    public void send() {
//        streamClient.input().streamClient
        streamClient.output().send(MessageBuilder.withPayload("from sinkSender").build());
    }

    @RequestMapping(value = "callTest",method = RequestMethod.GET)
    public String callTest() {
        log.info("=======");
        return consumeService.callTest();
    }
}
