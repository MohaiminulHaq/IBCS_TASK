package com.example.ibcstextDemo.controller;


import com.example.ibcstextDemo.services.GradeService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@AllArgsConstructor
@Controller
public class controller {

    public final GradeService gradeService;

    @GetMapping("/home")
    public String home () {

        return "home";
    }


    @GetMapping("/grade")
    public String grade () {
        return "grade";
    }





}
