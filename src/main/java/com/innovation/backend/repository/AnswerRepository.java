package com.innovation.backend.repository;

import com.innovation.backend.entity.Answer;
import com.innovation.backend.entity.Interview;
import com.innovation.backend.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AnswerRepository extends JpaRepository<Answer,Long> {
    Optional<Answer> findByMemberAndInterview(Member member, Interview interview);
}
