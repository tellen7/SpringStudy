package com.laowang.annotationBase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes=Config.class)
@ContextConfiguration(classes=JavaConfig.class)
public class TestA {
	
//	@Autowired
//	private JsrService jsrservice;
//	
//	@Test
//	public void testService(){
//		jsrservice.doSave();
//	}
	
	@Autowired
	private JsrDAO jsDao;
	
	@Test
	public void testDAO(){
		jsDao.save();
	}
}
