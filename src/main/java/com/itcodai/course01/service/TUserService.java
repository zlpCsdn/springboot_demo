package com.itcodai.course01.service;

import com.itcodai.course01.dao.TUserDao;
import com.itcodai.course01.dao.UserMapper;
import com.itcodai.course01.entity.Tuser;
import com.itcodai.course01.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;


@Service
public class TUserService {

    @Resource
    private TUserDao userDao;


    public Tuser getByUsername(String username) {
        return userDao.getByUsername(username);
    }

    public Set<String> getRoles(String username) {
        return userDao.getRoles(username);
    }

    public Set<String> getPermissions(String username) {
        return userDao.getPermissions(username);
    }
}
