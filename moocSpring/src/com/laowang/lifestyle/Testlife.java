package com.laowang.lifestyle;

import org.junit.Test;

import com.laowang.test.BasedTest;

public class Testlife extends BasedTest {
	public Testlife() {
		super("classpath*:spring-lifstyle.xml");
	}
	
	@Test
	public void testLife(){
		LifeStyle lifeStyle = super.getBean("lifestyle");
		lifeStyle.hashCode();
	}
}
