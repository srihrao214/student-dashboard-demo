package com.example.student_dashboard;

import com.example.student_dashboard.model.Student;
import com.example.student_dashboard.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.AssertionsKt.assertNotNull;

@DataJpaTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    void shouldSaveStudent() {

        Student student = new Student();
        student.setName("Sriram");
        student.setEmail("srihrao@gmail.com");

        Student saved = studentRepository.save(student);

        assertNotNull(saved.getId());
        assertEquals("Sriram", saved.getName());
    }
    @Test
    void shouldFindStudentById() {

        Student student = new Student();
        student.setName("John");
        student.setEmail("john@test.com");

        Student saved = studentRepository.save(student);

        Optional<Student> found =
                studentRepository.findById(saved.getId());

        assertTrue(found.isPresent());
    }
}