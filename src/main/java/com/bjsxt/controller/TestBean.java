package com.bjsxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author: yaoshanshan
 * @createDate: 2020/3/17
 * @version: 1.0
 */
@Controller
@RequestMapping("/test")
public class TestBean {
    @RequestMapping("/testDemo")
    @ResponseBody
    public String TestDemo(){
        return  "hello";
    }
}
