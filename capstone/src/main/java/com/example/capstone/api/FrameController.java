package com.example.capstone.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import com.example.capstone.config.WebSocketConfig;
import com.example.capstone.api.MyWebSocketHandler;

import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("/api/frames")
public class FrameController {

    @Autowired
    private MyWebSocketHandler myWebSocketHandler;
    @PostMapping
    public void receiveFrame(@RequestBody Map<String, Object> payload) throws IOException {
        String imageBase64 = (String) payload.get("imageBase64");
        float similarity = Float.parseFloat(payload.get("similarity").toString());
        String message = String.format("{\"image\":\"%s\", \"similarity\":%.2f}", imageBase64, similarity);

        // 메시지를 모든 연결된 웹소켓 클라이언트에게 전송
        for (WebSocketSession session : myWebSocketHandler.getSessions()) {
            if (session.isOpen()) {
                try {
                    session.sendMessage(new TextMessage(message));
                } catch (
                        IOException e
                ){
                    e.printStackTrace();
                }
            }

        }
    }
}

