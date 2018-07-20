package com.cherry.order.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * Description:
 * Author: cherry
 * Date: Created in 2018/7/2 下午8:07
 */
//@Slf4j
//@Component
//@EnableBinding(StreamInput.class)
//public class StreamReceiver {
//
//    @StreamListener(StreamInput.QUEUE)
//    public void process(Object message){
//        log.info("receive message:{}",message);
//        log.info("--------------------------------------------------");
//    }
//}
