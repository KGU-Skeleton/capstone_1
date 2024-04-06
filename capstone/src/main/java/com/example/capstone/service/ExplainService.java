package com.example.capstone.service;

import com.example.capstone.dto.ExplainDto;
import com.example.capstone.entity.Explain;
import com.example.capstone.repository.ExplainRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class ExplainService {
    @Autowired
    ExplainRepository explainRepository;

    public ExplainDto getExplain(String movement){
        //동작 이름 조회
        Explain explainEntity=explainRepository.findByMovement(movement);
        //변환: entity -> dto
        return ExplainDto.createExplainDto(explainEntity);
    }

    @Transactional
    public ExplainDto create(ExplainDto dto) {
        // 데이터베이스에서 동일한 movement 값을 가진 엔티티가 있는지 확인
        if (explainRepository.findByMovement(dto.getMovement())!=null) {
            throw new DataIntegrityViolationException("동일한 movement 값을 가진 데이터가 이미 존재합니다.");
        }
        //설명 entity 생성
        Explain explain=Explain.createExplain(dto);
        // entity db에 저장
        Explain created = explainRepository.save(explain);
        return ExplainDto.createExplainDto(created);
    }
    @Transactional
    public ExplainDto update(String movement,ExplainDto dto){

        // 요청 경로의 movement와 요청 본문의 movement가 일치하는지 검사
        if (!movement.equals(dto.getMovement())) {
            throw new IllegalArgumentException("경로의 movement 값과 본문의 movement 값이 일치하지 않습니다.");
        }
        // 타겟 조회
        Explain target = explainRepository.findByMovement(movement);
        if (target == null) {
            // 해당 movement를 가진 엔티티가 없으면 예외 처리
            throw new EntityNotFoundException("movement에 해당하는 엔티티를 찾을 수 없습니다: " + movement);
        }
        // 수정 메서드 호출
        target.patch(dto);
        // DB에 수정 사항 반영
        Explain updated = explainRepository.save(target);

        return ExplainDto.createExplainDto(updated);
    }


    @Transactional
    public ExplainDto delete(String movement) {
        if(explainRepository.findByMovement(movement).getMovement()==null)
            throw new IllegalArgumentException("댓글 삭제 실패! 대상이 없습니다.");

        Explain target=explainRepository.findByMovement(movement);

        explainRepository.delete(target);
        return ExplainDto.createExplainDto(target);
    }



}
