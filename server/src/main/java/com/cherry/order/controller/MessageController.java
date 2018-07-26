package com.cherry.order.controller;

import com.cherry.order.message.StreamOutput;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Description:
 * Author: cherry
 * Date: Created in 2018/7/25 下午5:09
 */
@Slf4j
@RestController
@EnableBinding(StreamOutput.class)
public class MessageController {

    @Autowired
    private StreamOutput streamOutput;

    @GetMapping("/send")
    public void sendMessage(){
        streamOutput.output()
                .send(MessageBuilder.withPayload("now time is :" + new Date()).build());
        log.info("the message send OK !!!");
    }

}
