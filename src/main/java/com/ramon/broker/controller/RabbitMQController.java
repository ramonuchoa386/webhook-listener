package com.ramon.broker.controller;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ramon.broker.controller.dto.Notification;
import com.ramon.broker.sender.RabbitMQSender;

@RestController
public class RabbitMQController {

    private final RabbitMQSender rabbitMQSender;

    @Autowired
    public RabbitMQController(RabbitMQSender rabbitMQSender) {
        this.rabbitMQSender = rabbitMQSender;
    }

    @PostMapping(value = "/listener", consumes = "application/json", produces = "text/plain")
    public ResponseEntity<String> sendToRabbitMQ(@RequestBody Notification notification) {
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonNotification;

        try {
            jsonNotification = objectMapper.writeValueAsString(notification);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error ao converter a notificação para JSON", e);
        }

        MessageProperties properties = new MessageProperties();
        properties.setContentType("application/json");
        Message message = new Message(jsonNotification.getBytes(), properties);

        rabbitMQSender.sendMessage("notifications", message);

        return ResponseEntity.status(HttpStatus.CREATED).body("Notificação enviada para o RabbitMQ.");
    }
}