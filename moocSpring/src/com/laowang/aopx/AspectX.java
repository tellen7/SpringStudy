package com.laowang.aopx;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectX {
	
	@Pointcut("execution(* com.laowang.aopx.ServiceMine.*(..))")
	public void pointcut(){}
	
	@Before("execution(* com.laowang.aopx.ServiceMine.*(..))")
//	@Before("pointcut()")
	public void before(){
		System.out.println("this is before...");
	}
	
	@AfterReturning(pointcut="pointcut()", returning="value")
	public void afterReturning(Object value){
		System.out.println("afterReturning..."+value);
	}
	
	@AfterThrowing(pointcut="pointcut()",throwing="e")
	public void afterThrowing(RuntimeException e){
		System.out.println("afterThrowing..."+e.getMessage());
	}
	
	@Around("pointcut()")
	public void around(ProceedingJoinPoint pjp)throws Throwable{
		System.out.println("before around...");
		Object object = pjp.proceed();
		System.out.println("after around..."+object);
	}
}
