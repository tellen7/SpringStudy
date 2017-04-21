package com.laowang.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.laowang.service.InjectionService;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjection extends BasedTest{
	public TestInjection(){
		super("classpath*:spring-injection.xml");
	}
	
	@Test
	public void testInjection(){
		InjectionService service = super.getBean("injectionservice");
		service.save("顾客数据");
	}
}
