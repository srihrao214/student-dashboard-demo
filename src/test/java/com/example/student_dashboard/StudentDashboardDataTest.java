package com.example.student_dashboard;

import com.example.student_dashboard.repository.StudentRepository;
import com.example.student_dashboard.repository.TeacherRepository;
import com.example.student_dashboard.repository.LectureRepository;
import com.example.student_dashboard.repository.ExamRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Disabled
@SpringBootTest
class StudentDashboardDataTest {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private LectureRepository lectureRepository;

    @Autowired
    private ExamRepository examRepository;

    @Test
    void shouldLoadInitialDemoData() {
        assertEquals(10, studentRepository.count());
        assertEquals(5, teacherRepository.count());
        assertEquals(10, lectureRepository.count());
        assertEquals(10, examRepository.count());
    }
}
