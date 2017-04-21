package com.laowang.aopy;

import org.aspectj.lang.ProceedingJoinPoint;

public class Aspect {
	public void before(){
		System.out.println("this is before...");
	}
	
	public void after(){
		System.out.println("this is after...");
	}
	
	public void afterReturn(){
		System.out.println("this is afterReturning...");
	}
	
	public void afterThrow(){
		System.out.println("this is afterThrowing...");
	}
	
	public Object around(ProceedingJoinPoint pjp){
		Object object=null;
		try {
			System.out.println("before around...");
			object = pjp.proceed();
			System.out.println("after around...");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		return object;
	}
	
	public Object aroundinit(ProceedingJoinPoint pjp,String name, int id){
		System.out.println("拦截方法调用。name:"+name+" id:"+id);
		Object object=null;
		try {
			System.out.println("before aroundinit...");
			object = pjp.proceed();
			System.out.println("after aroundinit...");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		return object;
	}
}
