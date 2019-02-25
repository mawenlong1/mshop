package com.mwl.mshop.provider;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author mawenlong
 * @date 2019-02-25 21:06
 */
@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloFallback")
    public String helloService() {
        return restTemplate.getForEntity("http://EUREKA-CLIENT/hello", String.class).getBody();
       }

    public String helloFallback() {
        return "error";
    }
}
