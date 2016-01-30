package com.zttc.spring.dao;

import com.zttc.spring.medol.User;

/**
 * Created by �� on 2015/12/20.
 */
public class UserDao implements IUserDao {
    @Override
    public void add(User user) {
        System.out.println("添加了："+user);
    }

    @Override
    public void delete(int id) {
        System.out.println("delete:"+id);

    }

    @Override
    public User load(int id) {
        System.out.println("load:"+id);
        return null;
    }
}
