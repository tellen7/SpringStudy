package com.laowang.aware;

import org.junit.Test;

import com.laowang.test.BasedTest;

public class TestAware extends BasedTest{
 public TestAware() {
	 super("classpath*:spring-aware.xml");
 }
 
 @Test
 public void testApplication(){
	 AplicationContext aplicationContext = super.getBean("applicationContext");
	 System.out.println("applicationContextByTest: "+aplicationContext.hashCode());
	 
 }
}
