package com.webonise.controllers;

import com.webonise.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/add")
    public ModelAndView hello(Student student){
        ModelAndView modelAndView=new ModelAndView("hello");
        modelAndView.addObject("student",student);
        return modelAndView;
    }
}
