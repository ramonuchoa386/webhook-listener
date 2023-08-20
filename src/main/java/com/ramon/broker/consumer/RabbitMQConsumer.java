package com.ramon.broker.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.ramon.broker.controller.dto.Notification;

@Component
public class RabbitMQConsumer {

    @RabbitListener(queues = "notifications")
    public void receiveMessage(Notification message) {
        System.out.println("ID do evento recebido: " + message.getNotification().getEvent().getId());
    }
}