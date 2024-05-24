//package com.example.capstone.config;
//
//import com.example.capstone.dto.FrameDTO;
//import com.example.capstone.incoding.ImageEncoder;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.ResourceLoader;
//import org.springframework.messaging.simp.SimpMessagingTemplate;
//import org.springframework.scheduling.annotation.EnableScheduling;
//import org.springframework.scheduling.annotation.Scheduled;
//import java.io.File;
//import java.io.IOException;
//import org.springframework.core.io.Resource;
//
//
//@Slf4j
//@Configuration
//@EnableScheduling
//public class SchedulingConfig {
//
//    private final SimpMessagingTemplate messagingTemplate;
//    private final ImageEncoder imageEncoder;
//    private final ResourceLoader resourceLoader;
//
//    @Autowired
//    public SchedulingConfig(SimpMessagingTemplate messagingTemplate, ImageEncoder imageEncoder, ResourceLoader resourceLoader) {
//        this.messagingTemplate = messagingTemplate;
//        this.imageEncoder = imageEncoder;
//        this.resourceLoader = resourceLoader;
//    }
//
//    @Scheduled(fixedRate = 5000)
//    public void sendPeriodicMessages_image() {
//        try {
//            // 리소스 로더를 사용하여 이미지 파일을 안전하게 로드합니다.
//            Resource resource = resourceLoader.getResource("classpath:picture/pic.jpg");
//            File imageFile = resource.getFile();
//
//            // 이미지를 Base64로 인코딩합니다.
//            String base64Image = imageEncoder.encodeImageToBase64(imageFile);
//
//            // DTO 객체를 생성하고 Base64 이미지를 설정합니다.
//            FrameDTO frame = new FrameDTO(base64Image, 0.9f);
//
//            // 웹소켓을 통해 DTO 객체를 전송합니다.
//            messagingTemplate.convertAndSend("/topic/frame", frame);
//
//            log.info("보내졌음");
//        } catch (IOException e) {
//            log.error("이미지를 인코딩하는 중에 오류가 발생했습니다.", e);
//        }
//    }
//
////아래는 사진이 아니고 String으로 통신이 원할한지 확인하는 것
//
//    @Scheduled(fixedRate = 3000) // 매 3초마다 실행
//    public void sendPeriodicMessages() {
//        FrameDTO frame = new FrameDTO("Base64 Encoded Image String", 0.9f);
//        messagingTemplate.convertAndSend("/topic/frame", frame);
//        log.info("보내졌음");
//    }
//
//
//}