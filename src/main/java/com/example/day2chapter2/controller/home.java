package com.example.day2chapter2.controller;
import java.util.*;
import com.example.day2chapter2.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class home {

    @GetMapping("about")
    public ArrayList<StudentModel> getStudent(){

        ArrayList<StudentModel> al=new ArrayList<>();
        StudentModel student =new StudentModel(1,"piyush","piyush@gmail.com");
        al.add(student);

        al.add(new StudentModel(2,"manoj","666@gmail.com"));
        al.add(new StudentModel(3,"tushar","aaaaa@gmail.com"));
        al.add(new StudentModel(4,"tanmay","-1@gmail.com"));
        al.add(new StudentModel(5,"rahul","2019@gmail.com"));


        return al;
    }

}
