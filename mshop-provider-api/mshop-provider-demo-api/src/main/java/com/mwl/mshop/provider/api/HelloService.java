package com.mwl.mshop.provider.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author mawenlong
 * @date 2019-02-25 22:51
 */
@FeignClient(name = "eureka-client")
public interface HelloService {
    @RequestMapping("hello")
    String hello();
}
