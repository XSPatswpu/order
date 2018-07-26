package com.cherry.order.message;

import com.cherry.order.dto.OrderMasterDTO;
import com.cherry.order.entity.OrderMaster;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Description:
 * Author: cherry
 * Date: Created in 2018/7/20 下午4:51
 */
/*@Slf4j
@Component
public class MqReceiver {

    //方式1、需要手动在RabbitMQ的控制面板上添加队列
    //@RabbitListener(queues = "cherryQueue")
    //方式2、自动创建队列
    //@RabbitListener(queuesToDeclare = @Queue("cherryQueue"))
    //方式3、自动创建队列，Exchanges和Queue绑定
    @RabbitListener(bindings = @QueueBinding(exchange = @Exchange("order"),value = @Queue("cherryQueue"),key = "phone"))
    public void processForPhone(String message){
        log.info("MqReceiver phone: {}",message);
    }

    @RabbitListener(bindings = @QueueBinding(exchange = @Exchange("order"),value = @Queue("cherryQueue"),key = "computer"))
    public void processForComputer(String orderMaster){
        OrderMasterDTO orderMasterDTO = JSON.parseObject(orderMaster,OrderMasterDTO.class);
        log.info("MqReceiver orderMaster: {}",orderMasterDTO);
    }
}*/
