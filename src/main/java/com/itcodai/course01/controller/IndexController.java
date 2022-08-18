package com.itcodai.course01.controller;

import com.itcodai.course01.entity.UnInterception;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 跳转Controller
 */
@Controller
public class IndexController {

    @GetMapping("/login")
    @UnInterception
    public String login() {
        return "login";
    }

    @GetMapping("/unauthorized")
    @UnInterception
    public String unauthorized() {
        return "unauthorized";
    }
}