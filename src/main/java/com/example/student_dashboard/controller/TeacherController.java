package com.example.student_dashboard.controller;

import com.example.student_dashboard.repository.TeacherRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeacherController {

    private final TeacherRepository teacherRepo;

    public TeacherController(TeacherRepository teacherRepo) {
        this.teacherRepo = teacherRepo;
    }

    @GetMapping("/teachers")
    public String showTeachers(Model model) {
        model.addAttribute("teachers", teacherRepo.findAll());
        return "teachers";
    }
}