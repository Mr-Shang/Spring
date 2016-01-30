package com.zttc.spring.dao;

import com.zttc.spring.medol.User;
import org.springframework.stereotype.Repository;

/**
 * Created by �� on 2015/12/20.
 */
//等於完成了<bean id="userDao" class="com.zttc.spring.UserDao">
//@Component("userDao")
    @Repository("UserDao")
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
