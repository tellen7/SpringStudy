package com.laowang.aopy;

public class Service {
	public void say(){
		System.out.println("Hello!");
	}
	
	public void throwing(){
		throw new RuntimeException();
	}
	
	public void init(String name, int id){
		System.out.println("around advice with parameter:"+name+"+"+id);
		System.out.println("可以使用环绕通知监视系统性能，资源占用等");
	}
}
