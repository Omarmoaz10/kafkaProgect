package com.example.kafka.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(
            topics = "omartopic",
            groupId = "groupId"
    )
    void listener(String data){
        System.out.println("Listener received: "+data + "\uD83E\uDD17");
    }

}
