package com.example.capstone.api;

import com.example.capstone.dto.FrameDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
public class FrameController {

    private final SimpMessagingTemplate messagingTemplate;

    @Autowired
    public FrameController(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    @PostMapping("/api/frames")
    public ResponseEntity<Void> uploadFrame(@RequestBody FrameDTO frameDTO) {
        // WebSocket을 통해 연결된 클라이언트들에게 이미지 데이터와 유사도 값을 전송
        messagingTemplate.convertAndSend("/topic/frame", frameDTO);
        return ResponseEntity.ok().build();
    }

}

