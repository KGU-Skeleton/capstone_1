package com.example.capstone.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOriginPatterns("*")  // allowedOrigins 대신 allowedOriginPatterns 사용
                .allowedMethods("OPTIONS", "GET", "POST", "PUT", "DELETE")
                .allowCredentials(false);  // 명시적으로 credentials 허용하지 않음
    }
}
