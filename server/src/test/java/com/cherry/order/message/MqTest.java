package com.cherry.order.message;

import com.cherry.order.OrderApplicationTest;
import com.cherry.order.dto.OrderMasterDTO;
import com.cherry.order.entity.OrderMaster;
import com.cherry.order.utils.CherryUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * Description: 发送MQ消息测试
 * Author: cherry
 * Date: Created in 2018/7/20 上午11:16
 */
/*public class MqTest extends OrderApplicationTest {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Test
    public void sendMessage(){
        //第一个参数为：队列的名字，第二个参数：要发送的内容
        amqpTemplate.convertAndSend("cherryQueue","now time is :" + new Date());
    }

    @Test
    public void sendMessage2(){
        OrderMasterDTO orderMaster = new OrderMasterDTO();
        orderMaster.setName("cherry-peng");
        String orderJson = JSON.toJSONString(orderMaster);

        //第一个参数为：队列的名字，第二个参数：要发送的内容
        amqpTemplate.convertAndSend("order","computer",orderJson);
    }

}*/
