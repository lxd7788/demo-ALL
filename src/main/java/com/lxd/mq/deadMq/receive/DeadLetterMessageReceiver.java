package com.lxd.mq.deadMq.receive;

import com.lxd.mq.deadMq.config.RabbitMQConfig;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.springframework.amqp.core.Message;

import java.io.IOException;

/**
 * @ClassName DeadLetterMessageReceiver
 * @Author lxd
 * @Date 2020/6/22 23:18
 * @Description 私信队列
 */
@Component
public class DeadLetterMessageReceiver {


    @RabbitListener(queues = RabbitMQConfig.DEAD_LETTER_QUEUEA_NAME)
    public void receiveA(Message message, Channel channel) throws IOException {
        System.out.println("收到死信消息A：" + new String(message.getBody()));
        channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
    }

    @RabbitListener(queues = RabbitMQConfig.DEAD_LETTER_QUEUEB_NAME)
    public void receiveB(Message message, Channel channel) throws IOException {
        System.out.println("收到死信消息B：" + new String(message.getBody()));
        channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
    }
}
