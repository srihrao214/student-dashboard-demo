package com.example.student_dashboard.controller;

import com.example.student_dashboard.repository.ExamRepository;
import com.example.student_dashboard.repository.LectureRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashboardController {

    private final LectureRepository lectureRepo;
    private final ExamRepository examRepo;

    public DashboardController(LectureRepository lectureRepo, ExamRepository examRepo) {
        this.lectureRepo = lectureRepo;
        this.examRepo = examRepo;
    }

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("lectures", lectureRepo.findAll());
        model.addAttribute("exams", examRepo.findAll());
        return "index";
    }
}
