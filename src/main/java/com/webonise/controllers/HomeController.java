package com.webonise.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public  String home(){
        return "test";
    }

    @RequestMapping("/hello")
    public  String hello(){
        return "hello";
    }
}
