package com.itcodai.course01.service;

import com.itcodai.course01.dao.UserMapper;
import com.itcodai.course01.entity.MyEvent;
import com.itcodai.course01.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class UserService {
    @Autowired
    private UserMapper userMapper;
    public User getUserByName(String username) {
        return userMapper.getUserByName(username);
    }
    public User getUser(Long id) {
        return userMapper.getUser(id);
    }
    public void insertUser(User user){
    }
    public void insertUser2(User user) throws Exception {
    }
    public void isertUser3(User user) {
    }
    public synchronized void isertUser4(User user) {
    }
    /**
     * 获取用户信息
     * @return
     */
    public User getUser() {
        // 实际中会根据具体的业务场景，从数据库中查询对应的信息
        return new User(1, "倪升武", "123456");
    }

}
