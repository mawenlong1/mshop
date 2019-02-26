package com.mwl.mshop.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mawenlong
 * @date 2019/02/26
 */
@RefreshScope
@RestController
public class ConfigTestController {

    @Value("${from}")
    private String from;

    @RequestMapping("from")
    public String from() {
        return from;
    }
}
