package com.example.student_dashboard.repository;

import com.example.student_dashboard.model.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LectureRepository extends JpaRepository<Lecture, Long> {
    // You can add custom queries here later if needed
    // Example:
    // List<Lecture> findByDayOfWeek(String dayOfWeek);
}
