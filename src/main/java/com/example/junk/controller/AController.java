package com.example.junk.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller

@RequestMapping("/attendance")

public class AController {

    @GetMapping("/main")
    public String attendMainPage(HttpSession session, Model model) {
        model.addAttribute("haha","haha");
        return "/attendance/main"; // Thymeleaf는 자동으로 resources/templates 디렉토리를 참조합니다.
    }



}
