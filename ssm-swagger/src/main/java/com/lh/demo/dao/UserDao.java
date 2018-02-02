package com.lh.demo.dao;

import com.lh.demo.entity.User;

import java.util.List;

/**
 * 持久层接口
 */
public interface UserDao {
    List<User> getUser();
}
