package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class noticecontroller {
    @RequestMapping(value = "/member/login")
    public void memberlogin() {
    }
    @RequestMapping(value = "/member/logout")
    public void memberlogout() {
    }
    @RequestMapping(value = "/member/signup")
    public void membersignup() {
    }
}