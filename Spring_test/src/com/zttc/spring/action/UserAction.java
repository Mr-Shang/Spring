package com.zttc.spring.action;

import com.zttc.spring.medol.User;
import com.zttc.spring.service.IUserService;

/**
 * Created by ¶« on 2015/12/20.
 */
public class UserAction {
    private User user;
    private IUserService userService;
    private  int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public IUserService getUserService() {
        return userService;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }


//    public UserAction(IUserService userService) {
//        this.userService = userService;
//    }

    public  void  add(){
        userService.add(user);

    }
    public void delete(){
        userService.delete(id);

    }
    public void  load(){
        userService.load(id);

    }
}
