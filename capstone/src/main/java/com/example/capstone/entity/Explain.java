package com.example.capstone.entity;

import com.example.capstone.dto.ExplainDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor


public class Explain {

    @Id
    private String movement;    // pk, 하위 동작
    @Column
    private String sport;  //운동이름
    @Column
    private boolean ball;    //non ball game 또는 ball game인지 상위 분류
    @Column
    private String explain; //동작 설명


    public static Explain createExplain(ExplainDto dto) {
        return new Explain(
                dto.getMovement(),
                dto.getSports(),
                dto.isBall(),
                dto.getExplain());
    }

    public void patch(ExplainDto dto) {

        //객체를 갱신
        if(dto.getSports()!=null)
            this.sport=dto.getSports();
        if(dto.getExplain()!=null)
            this.explain=dto.getExplain();
        //ball 필드에 대한 패치는 제외

    }
}
