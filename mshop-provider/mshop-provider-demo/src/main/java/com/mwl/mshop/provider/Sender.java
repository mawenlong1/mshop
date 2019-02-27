package com.mwl.mshop.provider;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author mawenlong
 * @date 2019-02-26 22:47
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        String context = "hello:" + new Date();
        System.out.println("Sender------>" + context);
        amqpTemplate.convertAndSend("hello", context);
    }
}
