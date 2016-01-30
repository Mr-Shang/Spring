package com.zttc.spring.service;

import com.zttc.spring.dao.IUserDao;
import com.zttc.spring.medol.User;

/**
 * Created by ¶« on 2015/12/20.
 */
public class UserService implements IUserService {
    private IUserDao userDao;

    public IUserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public void delete(int id) {
        userDao.delete(id);

    }

    @Override
    public User load(int id) {
        return userDao.load(id);
    }
}
