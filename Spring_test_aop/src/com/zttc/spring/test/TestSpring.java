package com.zttc.spring.test;

import com.zttc.spring.action.UserAction;
import com.zttc.spring.medol.HelloWorld;
import com.zttc.spring.medol.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by �� on 2015/12/20.
 */
public class TestSpring {
//    ���spring�Ĺ���
    private BeanFactory beanFactory=new ClassPathXmlApplicationContext("beans.xml");
    @Test
    public  void testHello(){
//        ͨ��������ȡspring�Ķ���
//        �˴�gerBean�е�helloWorld����beans.xml�����ļ��е�id��
        HelloWorld helloWorld=(HelloWorld)beanFactory.getBean("helloworld");
        System.out.println(helloWorld.hello());

        HelloWorld helloWorld1=beanFactory.getBean("helloworld",HelloWorld.class);
//        ��ʱ��helloWorld1������Ǳ�spring������ġ�
        System.out.println(helloWorld1.hello());

//        beans.xml��scope����Ϊprototype��Ϊ����
        System.out.println(helloWorld==helloWorld1);
    }

    @Test
    public void  test01(){
        UserAction userAction=beanFactory.getBean("userAction",UserAction.class);
        User user=new User(1,"空空");
        userAction.setUser(user);
        userAction.add();

//        多例
        UserAction userAction1=beanFactory.getBean("userAction",UserAction.class);
        userAction1.add();
    }
}
