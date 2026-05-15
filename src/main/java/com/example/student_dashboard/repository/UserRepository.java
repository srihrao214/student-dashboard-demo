package com.example.student_dashboard.repository;

import com.example.student_dashboard.model.Exam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Exam, Long> {
}