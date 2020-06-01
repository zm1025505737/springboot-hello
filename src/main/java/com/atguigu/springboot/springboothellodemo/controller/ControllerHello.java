package com.atguigu.springboot.springboothellodemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerHello {
    //手动创建测试springboot
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){

        return "你真的好美丽";
    }
}
