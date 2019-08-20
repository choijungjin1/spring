package com.example.spring.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@CrossOrigin
@Controller
@RequestMapping(value = "/Organization")
public class OrganizationController {
    @RequestMapping (value = "/read")
    public ModelAndView read(@RequestParam Map<String, Object> paramMap, ModelAndView modelandView) {        
        String viewName = "/Organization/read";
        modelandView.setViewName(viewName);
        modelandView.addObject("paramMap", paramMap);
        return modelandView;
    }
    @RequestMapping (value = "/input")
    public void in() {}
}