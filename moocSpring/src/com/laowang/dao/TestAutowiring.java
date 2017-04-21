package com.laowang.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.laowang.service.InjectionService;
import com.laowang.test.BasedTest;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAutowiring extends BasedTest{
	
	public TestAutowiring() {
		super("classpath*:spring-autowire.xml");
	}

	@Test
	public void testAutowire(){
		InjectionService service = super.getBean("injectionservice");
		service.save("this is a test!");
	}
}
