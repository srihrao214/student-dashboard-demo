package com.example.student_dashboard.controller;

import com.example.student_dashboard.repository.ExamRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExamController {
    private final ExamRepository examRepo;
    public ExamController(ExamRepository examRepo) {
        this.examRepo = examRepo;
    }

    @GetMapping("/exams")
    public String showExams(Model model) {
        model.addAttribute("exams", examRepo.findAll());
        model.addAttribute("page", "exams");
        return "exams";
    }
}
