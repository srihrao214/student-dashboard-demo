package com.example.student_dashboard.controller;

import com.example.student_dashboard.model.Exam;
import com.example.student_dashboard.model.Student;
import com.example.student_dashboard.repository.ExamRepository;
import com.example.student_dashboard.repository.StudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ExamController {

    private final ExamRepository examRepository;
    private final StudentRepository studentRepository;

    public ExamController(ExamRepository examRepository,
                          StudentRepository studentRepository) {
        this.examRepository = examRepository;
        this.studentRepository = studentRepository;
    }

    @GetMapping("/exams")
    public String listExams(Model model) {
        model.addAttribute("exams", examRepository.findAll());
        return "exams";
    }

    @GetMapping("/exams/new")
    public String showCreateForm(Model model) {
        model.addAttribute("exam", new Exam());
        model.addAttribute("students", studentRepository.findAll());
        return "exam-form";
    }

    @PostMapping("/exams/save")
    public String saveExam(@ModelAttribute Exam exam) {

        Student student = studentRepository
                .findById(exam.getStudent().getId())
                .orElseThrow();

        exam.setStudent(student);

        examRepository.save(exam);

        return "redirect:/exams";
    }

    @GetMapping("/exams/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {

        Exam exam = examRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Exam not found"));

        model.addAttribute("exam", exam);
        model.addAttribute("students", studentRepository.findAll());

        return "exam-form";
    }

    @GetMapping("/exams/delete/{id}")
    public String deleteExam(@PathVariable Long id) {
        examRepository.deleteById(id);
        return "redirect:/exams";
    }
}