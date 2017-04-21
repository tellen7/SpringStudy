package com.laowang.aopy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.laowang.test.BasedTest;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAOP extends BasedTest {
	public TestAOP() {
		super("classpath*:spring-aopx.xml");
	}
	
	@Test
	public void testa() {
		Service service = super.getBean("service");
		service.say();
		
//		System.out.println("=====================");
//		System.out.println("  Test afterTrowing  ");
//		System.out.println("=====================");
//		service.throwing();
		
		System.out.println("=====================");
		System.out.println("     Test around     ");
		System.out.println("=====================");
		service.say();
		
		System.out.println("=====================");
		System.out.println("  Test around with p ");
		System.out.println("=====================");
		service.init("laowang", 21);
	}
	
	@Test
	public void testDeclareParent(){
		Filter fImpl = (Filter) super.getBean("service");
		fImpl.filter();
	}
}
