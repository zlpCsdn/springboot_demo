package com.itcodai.course01.controller;

import com.itcodai.course01.dao.UserMapper;
import com.itcodai.course01.entity.User;
import com.itcodai.course01.service.UserService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.SQLException;

@RestController
public class UserTestController {

    @Resource
    private UserService userService;
    @Resource
    private UserMapper userMapper;

    @RequestMapping("/getUserByName/{name}")
    public User getUserByName(@PathVariable String name) {
        return userService.getUserByName(name);
    }
    @RequestMapping("/getUser/{id}")
    public User getUser(@PathVariable long id) {
        return userService.getUser(id);
    }
    @PostMapping("/adduser")
    public String addUser(@RequestBody User user) throws Exception {
        if (null != user) {
            userService.insertUser(user);
            return "success";
        } else {
            return "false";
        }
    }


}
