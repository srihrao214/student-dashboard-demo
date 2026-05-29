package com.example.student_dashboard.repository;

import com.example.student_dashboard.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    // You can add custom queries here later if needed
    // Example:
    // List<Lecture> findByDayOfWeek(String dayOfWeek);
}