package com.mwl.mshop.provider.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author mawenlong
 * @date 2019-02-25 22:51
 */
@FeignClient(name = "eureka-client",fallback = HelloService.HelloFallBack.class)
public interface HelloService {
    @RequestMapping("hello")
    String hello();


    @Component
   static class HelloFallBack  implements HelloService{

        @Override
        public String hello() {
            System.out.println("服务降级");
            return "服务降级：error";
        }
    }
}
