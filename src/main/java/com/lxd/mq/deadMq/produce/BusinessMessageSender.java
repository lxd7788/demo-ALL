package com.lxd.mq.deadMq.produce;

import com.lxd.mq.deadMq.config.RabbitMQConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName BusinessMessageSender
 * @Author lxd
 * @Date 2020/6/22 23:21
 * @Description 生成着方法
 */
@Component
public class BusinessMessageSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendMsg(String msg){
        rabbitTemplate.convertSendAndReceive(RabbitMQConfig.BUSINESS_EXCHANGE_NAME, "", msg);
    }
}
