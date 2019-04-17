package com.ljf.jenkins.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("")
public class TestController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello ljf";
    }
}
