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
                .authorizeHttpRequests(authz -> authz
                        .anyRequest().permitAll())  // 모든 요청에 대한 접근 허용
                .httpBasic().disable();  // 기본 HTTP 인증 비활성화

        return http.build();
    }
}
