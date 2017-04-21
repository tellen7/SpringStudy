package com.laowang.test;

import org.junit.After;
import org.junit.Before;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BasedTest {

	private String springXmlpath;
	private ClassPathXmlApplicationContext context;

	public BasedTest() {
	}

	public BasedTest(String sprigXmlpath) {
		this.springXmlpath = sprigXmlpath;
	}

	@Before
	public void before() {
		if (this.springXmlpath.isEmpty()) {
			springXmlpath = "classpath*:spring-*.xml";
		}
		try {
			context = new ClassPathXmlApplicationContext(springXmlpath.split("[,\\s]+"));
			context.start();
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}

	@After
	public void after() {
		context.destroy();
	}

	@SuppressWarnings("unchecked")
	protected <T extends Object> T getBean(String beanId) {
		try {
			return (T) context.getBean(beanId);
		} catch (BeansException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	protected <T extends Object> T getBean(Class<T> clazz){
		try {
			return (T) context.getBean(clazz);
		} catch (BeansException e) {
			e.printStackTrace();
			return null;
		}
	}
}
