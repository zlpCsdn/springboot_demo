package com.itcodai.course01.controller;

import com.itcodai.course01.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/test2", produces = "application/json; charset=UTF-8")
public class TestController2 {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String testGet() {
        return "success";
    }
    @GetMapping("/user/{idd}/{name}")
    public String testPathVariable(@PathVariable(value = "idd") Integer id, @PathVariable String name) {
        System.out.println("获取到的id为：" + id);
        System.out.println("获取到的name为：" + name);
        return "success";
    }
    @RequestMapping("/user2")
    public String testRequestParam(@RequestParam(value = "idd", required = false) Integer id) {
        System.out.println("获取到的id为：" + id);
        return "success";
    }
    @PostMapping("/form1")
    public String testForm(@RequestParam String username, @RequestParam String password) {
        System.out.println("获取到的username为：" + username);
        System.out.println("获取到的password为：" + password);
        return "success";
    }
    //http://localhost:8001/test2/form2?username=zz&password=123
    @PostMapping("/form2")
    public String testForm(User user) {
        System.out.println("获取到的username为：" + user.getUsername());
        System.out.println("获取到的password为：" + user.getPassword());
        return "success";
    }

  /*  @PostMapping("/user1")
    public String testRequestBody(@RequestBody User user) {

        System.out.println("获取到的username为：" + user.getUsername());
        System.out.println("获取到的password为：" + user.getPassword());
        return "success";
    }*/
}
