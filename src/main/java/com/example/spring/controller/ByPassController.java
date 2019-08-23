package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin
@Controller
public class ByPassController {
    @RequestMapping(value = {"/thymeleafmerge/thymeleafBase"})
    public void byPass() { }

    @RequestMapping(value = {"/thymeleafmerge/thymeleafBase02"})
    public void byPass02() { }
}