package com.my.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
    @GetMapping("/list")
    public String showList(Model model) {
        model.addAttribute("title","리스트보기");
        return "showMember";
    }
}