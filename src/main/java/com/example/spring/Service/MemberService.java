package com.example.spring.Service;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@Service
public class MemberService {
    public Object getObject(Object dataMap) {
        Map<String, Object> resultObject = new HashMap<String, Object>();
        resultObject.put("MEMBER_ID", "293029301202");
        resultObject.put("NAME", "name 02");
        return resultObject;
    }
}
