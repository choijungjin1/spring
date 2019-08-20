package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/member")
public class MemberController {
    @RequestMapping(value = "/list")
    public void memberAction() {
    }
    @RequestMapping(value = "/view")
    public void memberview() {
    }
    @RequestMapping(value = "/delete")
    public void memberdelete() {
    }
    @RequestMapping(value = "/edit")
    public void memberedit() {
    }
}