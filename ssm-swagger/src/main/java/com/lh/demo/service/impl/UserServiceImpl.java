package com.lh.demo.service.impl;

import com.lh.demo.dao.UserDao;
import com.lh.demo.entity.User;
import com.lh.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    UserDao userDao;

    @Override
    public List<User> getUser() {
        return userDao.getUser();
    }
}
