package com.laowang.aopx;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.laowang.test.BasedTest;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAspectJ extends BasedTest{
	public TestAspectJ() {
		super("classpath*:spring-aop.xml");
	}
	
	@Test
	public void testAspectJ(){
		ServiceMine service = getBean("serviceMine");
		service.say();
		System.out.println("======================================");
		System.out.println("调用save方法，测试afterReturning截获返回值");
		System.out.println("======================================");
		service.save();
	}
	
	@Test
	public void testAspectJThrow(){
		ServiceMine service = getBean("serviceMine");
		service.throwing();
	}
	
}
