package com.zap.contadigital.rabbit_consumer.controller;

import com.zap.contadigital.rabbit_consumer.model.MessageExample;
import com.zap.contadigital.rabbit_consumer.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/log")
public class MessageController {

    @Autowired
    MessageRepository messageRepository;

    @GetMapping
    public List<MessageExample> listAll()
    {
        return messageRepository.findAll();
    }

}
