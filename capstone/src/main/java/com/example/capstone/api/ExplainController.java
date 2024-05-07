package com.example.capstone.api;

import com.example.capstone.dto.ExplainDto;
import com.example.capstone.entity.Explain;
import com.example.capstone.service.ExplainService;

import io.swagger.v3.oas.annotations.Operation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@Tag(name = "explains", description = "반환")
public class ExplainController {

    @Autowired
    ExplainService explainService;

    //GET
    @GetMapping("test1/{movement}")
    @Operation(summary = "동작 설명 가져오기", description = "주어진 동작에 대한 설명을 가져옵니다.")
    public ResponseEntity<ExplainDto> ball_game_explains(@PathVariable String movement){ //동작명 따와서 mapping 하는 중
        ExplainDto dtos=explainService.getExplain(movement); //서비스 실행

        return ResponseEntity.status(HttpStatus.OK).body(dtos);//결과 응답
    }

    //POST
    @PostMapping("test1/new")
    @Operation(summary = "", description = "")
    public ResponseEntity<?> createExplain(@RequestBody ExplainDto dto){
        // sport 또는 explain 필드에 한글 또는 띄어쓰기가 있는지 검사
        if (dto.getMovement().matches(".*[\\sㄱ-ㅎㅏ-ㅣ가-힣]+.*")) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Movement 필드에 한글 또는 띄어쓰기를 포함할 수 없습니다.");
        }
        try {
            ExplainDto explainDto = explainService.create(dto);
            return ResponseEntity.status(HttpStatus.CREATED).body(explainDto);
        } catch (DataIntegrityViolationException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
        }
    }

    //Patch
    @PatchMapping("test1/{movement}")
    @Operation(summary = "설명 생성", description = "새로운 설명을 생성. Movement 필드는 한글 또는 띄어쓰기를 포함할 수 없음.")
    public ResponseEntity<ExplainDto> updateExplain(
            @PathVariable String movement,@RequestBody ExplainDto dto
    ){
        // 서비스 계층에서 엔티티를 찾고, 없으면 예외 처리
        ExplainDto updateDto = explainService.update(movement, dto);
        if (updateDto == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(updateDto);
    }

    @DeleteMapping("test1/{movement}")
    @Operation(summary = "설명 삭제", description = "주어진 동작에 대한 설명을 삭제")
    public ResponseEntity<ExplainDto> deleteExplain(@PathVariable String movement){

        ExplainDto deleteDto=explainService.delete(movement);

        return ResponseEntity.status(HttpStatus.OK).body(deleteDto);
    }
}
