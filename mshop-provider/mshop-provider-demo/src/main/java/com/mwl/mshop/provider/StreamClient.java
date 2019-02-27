package com.mwl.mshop.provider;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author mawenlong
 * @date 2019-02-27 21:39
 */
public interface StreamClient {
    String INPUT = "inputMessage";
    String OUTPUT = "outputMessage";

    @Output(OUTPUT)
    MessageChannel output();

    @Input(INPUT)
    SubscribableChannel input();
}
