package com.mwl.mshop.provider.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author mawenlong
 * @date 2019-02-28 22:54
 */
@FeignClient(name = "eureka-consume", fallback = ConsumeService.ConsumeFallBack.class)
public interface ConsumeService {

    @RequestMapping("callTest")
    String callTest();


    @Component
    static class ConsumeFallBack implements ConsumeService {

        @Override
        public String callTest() {
            System.out.println("服务降级");
            return "服务降级：error";
        }
    }
}
