package com.samay.ashar.demo.controller;

import org.springframework.web.bind.annotation.*;

import com.samay.ashar.demo.service.MessageProducer;


@RestController
@RequestMapping("/api/messages")
public class MessageController {
    private final MessageProducer messageProducer;

    public MessageController(MessageProducer messageProducer){
        this.messageProducer = messageProducer;
    }

    @PostMapping("/send")
    public String sendMessage(@RequestParam String message) {
        //TODO: process POST request
        messageProducer.sendMessage(message);
        return "Message sent successfully!";
    }
    
}
