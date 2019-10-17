package com.deals.services;

import com.deals.dao.UserDao;
import com.deals.entities.User;

public class UserService {

    public void register(String username, String password, String confPassword) {
        if (username == null || username.equals("")) throw new IllegalArgumentException("adsdfg");
        if (password == null || password.equals("")) throw new IllegalArgumentException("adsdfg");
        if (!confPassword.equals(password)) throw new IllegalArgumentException("adsdfg");

        UserDao userDao = new UserDao();
        if (userDao.existsByUsername(username)) throw new IllegalStateException("adasdasd");

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        userDao.create(user);
    }
}
