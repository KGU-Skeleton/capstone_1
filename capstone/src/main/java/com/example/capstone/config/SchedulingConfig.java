package com.example.capstone.config;

import com.example.capstone.dto.FrameDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
@Slf4j

@Configuration
@EnableScheduling

public class SchedulingConfig {
    private final SimpMessagingTemplate messagingTemplate;

    @Autowired
    public SchedulingConfig(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }
    @Scheduled(fixedRate = 5000) // 매 5초마다 실행
    public void sendPeriodicMessages() {
        FrameDTO frame = new FrameDTO("Sample Image Base64", 0.9f);
        messagingTemplate.convertAndSend("/topic/frame", frame);
        log.info("보내졌음");
    }
}