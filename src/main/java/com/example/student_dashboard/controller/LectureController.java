package com.example.student_dashboard.controller;

import com.example.student_dashboard.repository.ExamRepository;
import com.example.student_dashboard.repository.LectureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LectureController {
    private final LectureRepository lectureRepo;
    private final ExamRepository examRepository;
    public LectureController(LectureRepository lectureRepo,ExamRepository examRepository) {
        this.lectureRepo = lectureRepo;
        this.examRepository=examRepository;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("lectures", lectureRepo.findAll());
        model.addAttribute("exams", examRepository.findAll());
        return "index";
    }
}

