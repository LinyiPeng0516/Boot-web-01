package com.example.bootweb01.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewTestController {

    @GetMapping("/success")
    public String PlySuccess(Model model) {
        model.addAttribute("msg","Hello, you are successfully accessed to the Server");
        model.addAttribute("url","http://www.baidu.com");
        return "Success";//thymeleaf default prefix, suffix
    }
}
