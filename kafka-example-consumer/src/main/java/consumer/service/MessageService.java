package consumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @KafkaListener(topics = "test", groupId = "test-group-1")
    public void consumeMessage(String message){
        System.out.println("Consumer received: " + message);
    }
}
