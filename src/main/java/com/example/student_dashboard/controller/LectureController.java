package com.example.student_dashboard.controller;

import com.example.student_dashboard.model.Lecture;
import com.example.student_dashboard.repository.LectureRepository;
import com.example.student_dashboard.repository.TeacherRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LectureController {

    private final LectureRepository lectureRepository;
    private final TeacherRepository teacherRepository;

    public LectureController(LectureRepository lectureRepository,
                             TeacherRepository teacherRepository) {
        this.lectureRepository = lectureRepository;
        this.teacherRepository = teacherRepository;
    }

    @GetMapping("/lectures")
    public String listLectures(Model model) {
        model.addAttribute("lectures", lectureRepository.findAll());
        return "lectures";
    }

    @GetMapping("/lectures/new")
    public String showCreateForm(Model model) {
        model.addAttribute("lecture", new Lecture());
        model.addAttribute("teachers", teacherRepository.findAll());
        return "lecture-form";
    }

    @PostMapping("/lectures/save")
    public String saveLecture(@ModelAttribute Lecture lecture) {
        lectureRepository.save(lecture);
        return "redirect:/lectures";
    }

    @GetMapping("/lectures/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {

        Lecture lecture = lectureRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Lecture not found"));

        model.addAttribute("lecture", lecture);
        model.addAttribute("teachers", teacherRepository.findAll());

        return "lecture-form";
    }

    @GetMapping("/lectures/delete/{id}")
    public String deleteLecture(@PathVariable Long id) {
        lectureRepository.deleteById(id);
        return "redirect:/lectures";
    }
}