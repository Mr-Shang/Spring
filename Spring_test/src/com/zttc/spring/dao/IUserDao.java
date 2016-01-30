package com.zttc.spring.dao;

import com.zttc.spring.medol.User;

/**
 * Created by ¶« on 2015/12/20.
 */
public interface IUserDao {
    public void add(User user);
    public void delete(int id);
    public User load(int id);

}
