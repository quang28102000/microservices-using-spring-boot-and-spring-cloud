package com.vodinhminhquang.notification.rabbitmq;

import com.vodinhminhquang.clients.notification.NotificationRequest;
import com.vodinhminhquang.notification.NotificationService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class NotificationConsumer {

    private final NotificationService notificationService;

    @RabbitListener(queues = "${rabbitmq.queues.notification}")
    public void consumer(NotificationRequest notificationRequest) {
        log.info("Consumer {} from queue", notificationRequest);
        notificationService.send(notificationRequest);
    }
}
