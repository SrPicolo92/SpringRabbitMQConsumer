package com.zap.contadigital.rabbit_consumer.model;

import com.zap.contadigital.rabbit_consumer.config.MQConfig;
import com.zap.contadigital.rabbit_consumer.model.MessageExample;
import com.zap.contadigital.rabbit_consumer.repository.MessageRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class MessageListener {

    @Autowired
    MessageRepository messageRepository;


    @RabbitListener(queues = MQConfig.QUEUE)
    public void listener(MessageExample message) throws InterruptedException {
        messageRepository.save(message);
        System.out.println(message);
        TimeUnit.SECONDS.sleep(5);

    }
}
