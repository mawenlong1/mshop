package com.mwl.mshop.provider;

import com.mwl.mshop.provider.api.HelloService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.Resource;

/**
 * @author mawenlong
 * @date 2019/02/25
 */
@RestController
@Slf4j
@EnableSwagger2
@Api(value = "Consume Control", description = "测试controller", tags = "Swagger Test Control Tag")
public class ConsumeController {

    @Resource
    HelloService helloService;

    @RequestMapping(value = "consume", method = RequestMethod.GET)
    public String helloConsume() {
        System.out.println("consume:=======  调用 client  =======");
        return helloService.hello();
    }


    @RequestMapping(value = "callTest", method = RequestMethod.GET)
    public String callTest() {
        log.info("callTest!!!!!");
        return "callTest";
    }

}
