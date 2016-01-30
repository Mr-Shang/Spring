package com.zttc.spring.proxy;

import java.util.Date;

/**
 * Created by ¶« on 2016/1/23.
 */
public class Logger {
    public static void info(String info){
        System.out.println(new Date()+"---->"+info);
    }
}
