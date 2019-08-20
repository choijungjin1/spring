package com.example.spring.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin
@RequestMapping(value = "/Organization")
public class OrganizationBean {
    String ORGANIZATION_SEQ;
    public String getORGANIZATION_SEQ() { return ORGANIZATION_SEQ; }
    public String setORGANIZATION_SEQ(String oRGANIZATION_SEQ) { return ORGANIZATION_SEQ; }
}
