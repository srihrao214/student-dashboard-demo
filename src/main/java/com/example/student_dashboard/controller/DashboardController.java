package com.example.student_dashboard.controller;

import com.example.student_dashboard.repository.ExamRepository;
import com.example.student_dashboard.repository.LectureRepository;
import com.example.student_dashboard.repository.StudentRepository;
import com.example.student_dashboard.repository.TeacherRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    private final LectureRepository lectureRepository;
    private final ExamRepository examRepository;
    private final StudentRepository studentRepository;
    private final TeacherRepository teacherRepository;

    public DashboardController(LectureRepository lectureRepository,
                               ExamRepository examRepository,
                               StudentRepository studentRepository,
                               TeacherRepository teacherRepository) {
        this.lectureRepository = lectureRepository;
        this.examRepository = examRepository;
        this.studentRepository = studentRepository;
        this.teacherRepository = teacherRepository;
    }

    @GetMapping("/")
    public String dashboard(Model model) {

        model.addAttribute("studentCount", studentRepository.count());
        model.addAttribute("teacherCount", teacherRepository.count());
        model.addAttribute("lectureCount", lectureRepository.count());
        model.addAttribute("examCount", examRepository.count());

        model.addAttribute("lectures", lectureRepository.findAll());
        model.addAttribute("exams", examRepository.findAll());

        long passCount = examRepository.findAll()
                .stream()
                .filter(exam -> exam.getResult().toString().equals("PASS"))
                .count();

        long failCount = examRepository.findAll()
                .stream()
                .filter(exam -> exam.getResult().toString().equals("FAIL"))
                .count();

        long pendingCount = examRepository.findAll()
                .stream()
                .filter(exam -> exam.getResult().toString().equals("PENDING"))
                .count();

        model.addAttribute("passCount", passCount);
        model.addAttribute("failCount", failCount);
        model.addAttribute("pendingCount", pendingCount);

        return "index";
    }
}
