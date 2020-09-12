package com.project1.cs485.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class thymeleafcontroller {
    @GetMapping(value = "/page1")
    public String homePage(){

        return "index";
    }
}
