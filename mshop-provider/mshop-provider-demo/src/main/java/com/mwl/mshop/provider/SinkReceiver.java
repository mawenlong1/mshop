package com.mwl.mshop.provider;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

/**
 * @author mawenlong
 * @date 2019-02-27 20:45
 */
@EnableBinding({StreamClient.class,StreamClient.class})
public class SinkReceiver {

    @StreamListener(StreamClient.INPUT)
    public void receive(Object data) {
        System.out.println("INPUT收到消息：" + data);
    }

//    @StreamListener(StreamClient.OUTPUT)
//    public void process(Object data) {
//        System.out.println("OUTPUT收到消息：" + data);
//    }
}
