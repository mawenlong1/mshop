package com.mwl.mshop.provider;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
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
    public String index() throws InterruptedException {
        System.out.println("client  =======  被调用   =======");
        return "hello";
    }
    @Autowired
    StreamClient streamClient;

    @RequestMapping(value = "send", method = RequestMethod.GET)
    public void send() {
//        streamClient.input().streamClient
        streamClient.output().send(MessageBuilder.withPayload("from sinkSender").build());
    }
}
