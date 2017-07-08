package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;
//import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 8420 on 30/06/17.
 */

@Controller
public class DemoController {

    private String message = "Hello World";

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("message", this.message);
        return "welcome";
    }
}
