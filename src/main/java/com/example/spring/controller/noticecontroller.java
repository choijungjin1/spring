package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class noticecontroller {
    @RequestMapping(value = "/member/view")
    public void memberview() {
    }
    @RequestMapping(value = "/member/delete")
    public void memberdelete() {
    }
    @RequestMapping(value = "/member/edit")
    public void memberedit() {
    }
    @RequestMapping(value = "/member/login")
    public void memberlogin() {
    }
    @RequestMapping(value = "/member/logout")
    public void memberlogout() {
    }
}