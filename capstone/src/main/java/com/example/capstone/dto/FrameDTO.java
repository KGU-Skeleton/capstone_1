package com.example.capstone.dto;

public class FrameDTO {
    private String imageBase64; // Base64로 인코딩된 이미지 데이터
    private float similarity;   // 유사도 값

    // 기본 생성자, getter, setter 추가
    public FrameDTO() {}

    public FrameDTO(String imageBase64, float similarity) {
        this.imageBase64 = imageBase64;
        this.similarity = similarity;
    }

    public String getImageBase64() {
        return imageBase64;
    }

    public void setImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
    }

    public float getSimilarity() {
        return similarity;
    }

    public void setSimilarity(float similarity) {
        this.similarity = similarity;
    }
}
