package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
    @RequestMapping(value = "/member/list")
    public void memberAction() {
    }
    @RequestMapping(value = "/member/view")
    public void memberview() {
    }
    @RequestMapping(value = "/member/delete")
    public void memberdelete() {
    }
    @RequestMapping(value = "/member/edit")
    public void memberedit() {
    }
}