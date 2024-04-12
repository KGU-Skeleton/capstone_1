package com.example.capstone.dto;

import com.example.capstone.entity.Explain;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class ExplainDto {
    private String movement;
    private String sports;
    private boolean ball;
    private String explain;
    private String videoUrl;

    public static ExplainDto createExplainDto(Explain explain) { //entity -> dto 변환 메소드
        return new ExplainDto(
                explain.getMovement(),
                explain.getSport(),
                explain.isBall(),
                explain.getExplain(),
                explain.getVideoUrl()

        );
    }
}
