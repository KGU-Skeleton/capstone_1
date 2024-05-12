package com.example.capstone.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()  // CSRF 보호를 비활성화
                .authorizeHttpRequests((authz) -> authz
                        .requestMatchers("/websocket/**").permitAll()  // WebSocket 경로에 대한 접근 허용
                        .anyRequest().authenticated()  // 그 외 모든 요청은 인증 필요
                )
                .httpBasic();  // 기본 HTTP 인증을 사용하는 예시입니다.
        return http.build();
    }
}