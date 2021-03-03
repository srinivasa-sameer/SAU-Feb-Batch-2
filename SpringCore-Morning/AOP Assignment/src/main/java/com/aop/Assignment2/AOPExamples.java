package com.aop.Assignment2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class AOPExamples {


    @Before("customPointcut()")
    public static void beforeAnnotation() {
        System.out.println("Before using execute pointcut annotation");
    }

    @After("customPointcut()")
    public static void afterAnnotation() {
        System.out.println("After using execute pointcut annotation");
    }

    @Pointcut("execution (public void getName())")
    public void customPointcut() {

    }

    @AfterReturning(pointcut = "execution(int getEmployeeCode())", returning = "roll")
    public void afterReturningAnnotation(int roll) {
        System.out.println("After returning annotation. Returned roll number = " + roll);
    }

    @AfterThrowing("args(course)")
    public void exceptionAdviceAnnotation(String course) {
        System.out.println("Exception is thrown. Course obtained before throwing exception = " + course);
    }


    @Around("execution (int getPercentage(int,int))")
    public Object aroundAdvices(ProceedingJoinPoint pt) {
        Object result = null;
        try{
            result = pt.proceed();
            System.out.println("Actual Percentage Before Around Advice = " + result);
        }
        catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println(result);
        result = 98;
        System.out.println("Returned overridden percentage after around advice = " + result);
        return result;
    }

    @Pointcut("within(com.aop.Assignment2.models.Organization)")
    public void withinPointcut() {
        System.out.println("Within pointcut applied to all methods inside Organization class");
    }
}