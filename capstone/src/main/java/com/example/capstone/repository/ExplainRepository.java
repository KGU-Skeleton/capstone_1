package com.example.capstone.repository;

import com.example.capstone.entity.Explain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExplainRepository extends JpaRepository<Explain,String> {
    @Query(value = "SELECT * FROM explain WHERE movement = :movement", nativeQuery = true)
    Explain findByMovement(String movement); //동작이름으로 조회
}
