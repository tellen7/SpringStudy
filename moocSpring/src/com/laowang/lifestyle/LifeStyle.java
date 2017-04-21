package com.laowang.lifestyle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeStyle implements InitializingBean, DisposableBean {
	public void start() {
		System.out.println("start method");
	}

	public void stop() {
		System.out.println("stop method");
	}

	public void init() {
		System.out.println("init method");
	}

	public void defaultdestroy() {
		System.out.println("defaultdestroy method");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet method");
	}
	
	@Override
	public void destroy(){
		System.out.println("DisposableBean destroy method");
	}
}
