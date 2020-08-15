package com.lxd.mq.deadMq.controller;

import com.lxd.mq.deadMq.produce.BusinessMessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName RabbitMQMsgController
 * @Author lxd
 * @Date 2020/6/22 23:21
 * @Description 私信队列调用测试
 * http://localhost:8080/rabbitmq/sendmsg?msg=msg
 * http://localhost:8080/rabbitmq/sendmsg?msg=deadletter
 */
@RequestMapping("rabbitmq")
@RestController
public class RabbitMQMsgController {

    @Autowired
    private BusinessMessageSender sender;

    @RequestMapping("sendmsg")
    public void sendMsg(String msg){
        sender.sendMsg(msg);
    }
}