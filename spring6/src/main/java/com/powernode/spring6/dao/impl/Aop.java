package com.powernode.spring6.dao.impl;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Repository;

@Repository("Aop")
@Aspect
public class Aop {
    @Before("execution(* com..*(..))")
    public void up() {
        System.out.println("我是一段增强代码");
    }
}
