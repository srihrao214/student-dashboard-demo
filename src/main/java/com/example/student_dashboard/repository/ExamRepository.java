package com.example.student_dashboard.repository;

import com.example.student_dashboard.model.Exam;

import com.example.student_dashboard.model.ResultStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Long> {
    // Example custom queries
    List<Exam> findByResult(ResultStatus result); // e.g. find all "PASS" exams
    List<Exam> findByStudentId(Long studentId);
}
