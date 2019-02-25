package com.mwl.mshop.provider;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mawenlong
 * @date 2019/02/25
 */
@Slf4j
@RestController
public class HelloController {

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String index() {
        // ServiceInstance instance = client.get
        return "hello";
    }
}
