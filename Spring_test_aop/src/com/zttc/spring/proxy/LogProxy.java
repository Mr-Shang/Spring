package com.zttc.spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by �� on 2015/12/21.
 */
/*
   写一个类实现InvocationHandler接口
 */
public class LogProxy implements InvocationHandler {
    /*
     * 创建一个代理对象。
     */
    private Object target;
    /*
    创建一个方法生成对象。返回的对象就是代理对象。
     */
    public  static Object getInstance(Object o){
        //3.1创建LogProxy对象；
        LogProxy logProxy=new LogProxy();
        //设置代理对象；
        logProxy.target=o;
        /*
        创建代理对象，第一个参数是要代理对象的classLoader，
        第二个对象是要代理对象实现的所有接口。
        第三个参数是实现了InvocationHandler的对象。
        此时的object就是一个代理对象，代理o。
         */
        Object object= Proxy.newProxyInstance(o.getClass().getClassLoader(),
                o.getClass().getInterfaces(),logProxy);
        return object;
    }
    /*
    有了代理对象之后，不管这个代理对象执行什么方法，都会调用一下的invoke方法。
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj =method.invoke(target,args);
        return obj;
    }
}
