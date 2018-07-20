package com.cherry.order.message;

import com.cherry.order.OrderApplicationTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;


/**
 * Description:
 * Author: cherry
 * Date: Created in 2018/7/19 下午4:09
 */
//@Slf4j
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@EnableBinding(StreamOutput.class)
//public class MessageTest {
//
//    @Autowired
//    private StreamOutput streamOutput;
//
//    @Test
//    public void sentMessageTest() {
//        streamOutput.output()
//                .send(MessageBuilder.withPayload("now time is :" + new Date()).build());
//        log.info("the message send OK !!!");
//    }
//
//}