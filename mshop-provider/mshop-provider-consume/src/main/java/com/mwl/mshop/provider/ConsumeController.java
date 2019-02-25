package com.mwl.mshop.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author mawenlong
 * @date 2019/02/25
 */
@RestController
public class ConsumeController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "consume", method = RequestMethod.GET)
    public String helloConsume() {
        return restTemplate.getForEntity("http://EUREKA-CLIENT/hello", String.class).getBody();
    }
}
