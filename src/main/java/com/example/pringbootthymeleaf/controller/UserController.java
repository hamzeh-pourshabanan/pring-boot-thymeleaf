package com.example.pringbootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("demo")
    public String demo(Model model) {
        model.addAttribute("message", "Hello Thymeleaf");
        model.addAttribute("color", "#ff0000");
        // return to templates/demo.html page.
        return "demo";
    }
}
