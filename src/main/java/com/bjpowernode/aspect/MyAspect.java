package com.bjpowernode.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

public class MyAspect {
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("before");
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("end");
        return proceed;
    }
}
