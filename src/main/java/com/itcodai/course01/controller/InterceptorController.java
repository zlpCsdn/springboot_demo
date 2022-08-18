package com.itcodai.course01.controller;

import com.itcodai.course01.entity.UnInterception;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/interceptor")
public class InterceptorController {

    @RequestMapping("/test")
    public String test() {
        return "hello";
    }
    @UnInterception
    @RequestMapping("/test2")
    @ResponseBody
    public String test2() {
        return "我没有被拦截";
    }
}
