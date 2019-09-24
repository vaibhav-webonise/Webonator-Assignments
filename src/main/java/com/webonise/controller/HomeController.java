package com.webonise.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {
    @RequestMapping(value="/")
    public String home(){
        return "test";
    }
}
