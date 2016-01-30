package com.zttc.spring.proxy;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by �� on 2016/1/23.
 */
@Component("logAspect")//表示這個類用spring管理
@Aspect//���@����������
public class LogAspect {

  /*  (* com.zttc.spring.dao.*.add*(..))
  第一個*表示任意返回值
  第二個*表示com.zttc.spring.dao包中的所有類。
  第三個*表示所有的add方法。
  （..）表示任意參數

   */
    @Before("execution(* com.zttc.spring.dao.*.add*(..))||" +
            "execution(* com.zttc.spring.dao.*.delete*(..))||" +
            "execution(* com.zttc.spring.dao.*.update*(..))")

    public void LogStart(JoinPoint joinPoint){
//      獲得執行的類
        System.out.println(joinPoint.getTarget());
//        獲得執行的方法
        System.out.println(joinPoint.getSignature().getName());

        Logger.info("添加了日誌");

    }
    @After("execution(* com.zttc.spring.dao.*.add*(..))||" +
            "execution(* com.zttc.spring.dao.*.delete*(..))||" +
            "execution(* com.zttc.spring.dao.*.update*(..))")

    public void LogEnd(JoinPoint joinPoint){
/*     獲得執行的類
        System.out.println(joinPoint.getTarget());
//       獲得執行的方法
        System.out.println(joinPoint.getSignature().getName());
*/

        Logger.info("方法調用結束添加了日誌");

    }
}
