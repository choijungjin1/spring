package com.example.spring.controller;

import java.util.Map;
import java.util.HashMap;

import com.example.spring.Service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@CrossOrigin
@Controller
@RequestMapping(value = "/member02")
public class MemberController02 {
    @Autowired
    private MemberService service;

    @RequestMapping(value = "/{action}")
    public ModelAndView member(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
            ModelAndView modelandView) {
        String viewName = "/member02/";
        Map<String, Object> resultMap = new HashMap<String, Object>();

        if ("member".equals(action)) {
            viewName = viewName + action;
            resultMap =(Map<String, Object>) service.getObject(paramMap);
        }
        modelandView.setViewName(viewName);
        modelandView.addObject("paramMap", resultMap);
        return modelandView;
    }    
}
