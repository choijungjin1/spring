package com.example.spring.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@CrossOrigin
@Controller
@RequestMapping(value = "/Organization01")
public class ListController {
    @RequestMapping(value = "/{action}")
    public ModelAndView list(@RequestParam Map<String, Object> ListMap, @PathVariable String action, ModelAndView modelandView) {
        String viewName = "/Organization01/";
        List<Object> resultList = new ArrayList<Object>();
        if ("list".equals(action)) {
            viewName = viewName + action;
            Map<String, Object> data01 = new HashMap<String, Object>();
            data01.put("name", "name01");
            data01.put("id", "490293232849");
            data01.put("DESCRIPTION", "DESCRIPTION 01");
            resultList.add(data01);

            Map<String, Object> data02 = new HashMap<String, Object>();
            data02.put("name", "name02");
            data02.put("id", "490293232850");
            data02.put("DESCRIPTION", "DESCRIPTION 02");
            resultList.add(data02);
            
            Map<String, Object> data03 = new HashMap<String, Object>();
            data03.put("name", "name03");
            data03.put("id", "490293232851");
            data03.put("DESCRIPTION", "DESCRIPTION 03");
            resultList.add(data03);
        }
        
        modelandView.setViewName(viewName);
        modelandView.addObject("ListMap", resultList);
        modelandView.addObject("search", resultList);
        return modelandView;
    }
    @RequestMapping (value = "/listinput")
    public void list() {}
}


