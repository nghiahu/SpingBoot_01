package com.example.demo_01.controller;

import com.example.demo_01.entity.Student;
import com.example.demo_01.repo.StudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    @GetMapping("/")
    public String student(Model model) {
        return "home";
    }
    @GetMapping("/bai1")
    public String bai1(Model model) {
        return "Bài 1,2";
    }
}
