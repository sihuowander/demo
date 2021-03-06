package com.example.demo.controller;


import com.example.demo.mapper.StudentMapper;
import com.example.demo.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Student 控制器
 *
 * @author: @我没有三颗心脏
 * @create: 2018-05-08-下午 20:25
 */
@Controller
@RequestMapping("/student/")
public class StudentController {

    @Autowired
    private StudentMapper studentMapper;

    @RequestMapping("listStudent")
    public String listStudent(Model model) {
        List<Student> students = studentMapper.findAll();
        model.addAttribute("students", students);
        return "listStudent";
    }
}
