package com.example.spring.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@CrossOrigin
@Controller
@RequestMapping(value = "/Organization")
public class OrganizationController {
    @RequestMapping(value = "/{action}")    
    public ModelAndView read(@RequestParam Map<String, Object> paramMap, @PathVariable String action, ModelAndView modelandView) {        
        String viewName = "/Organization/";
        Map<String, Object> resultMap = new HashMap<String, Object>();
        if ("read".equals(action)) {
            viewName = viewName + action;
            resultMap = paramMap;
        }
        modelandView.setViewName(viewName);
        modelandView.addObject("paramMap", resultMap);
        return modelandView;
    }
    @RequestMapping (value = "/input")
    public void in() {}
}