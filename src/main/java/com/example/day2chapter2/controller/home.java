package com.example.day2chapter2.controller;

import com.example.day2chapter2.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class home {

    @GetMapping("about")
    public StudentModel getStudent(){
        StudentModel student =new StudentModel(1,"piyush","piyush@gmail.com");
        //StudentModel student2 =new StudentModel(1,"piyush","piyush@gmail.com");

        return student;
    }
}
