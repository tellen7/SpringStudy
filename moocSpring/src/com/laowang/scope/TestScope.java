package com.laowang.scope;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.laowang.test.BasedTest;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestScope extends BasedTest{
	
	public TestScope() {
		super("classpath*:spring-scope.xml");
	}
	//单例，一个bean容器只存在一份
	@Test
	public void testScopeSigleton(){
		ScopeSingleton scope = super.getBean("beanscope");
		scope.say();
		ScopeSingleton s = super.getBean("beanscope");
		s.say();
	}
	
	@Test
	public void testScope(){
		ScopeSingleton scope = super.getBean("beanscope");
		scope.say();
	}
	//每次请求创建新实例，destroy方式不生效
	@Test
	public void testScopePrototype(){
		ScopePrototype scope = super.getBean("scopeprototype");
		scope.say();
		ScopePrototype s = super.getBean("scopeprototype");
		s.say();
	}
}
