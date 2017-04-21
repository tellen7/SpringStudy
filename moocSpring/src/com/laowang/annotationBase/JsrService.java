package com.laowang.annotationBase;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@Component
public class JsrService {

	//属性注入
//	@Autowired
//	@Resource
	private JsrDAO jsrDAO;
	
	//构造器注入
//	@Autowired
	public JsrService(JsrDAO jsrDAO){
		this.jsrDAO = jsrDAO;
	}
	
	public JsrService() {	}

	//set注入
	@Autowired()
	public void setJsrDAO(JsrDAO jsrDAO) {
		this.jsrDAO = jsrDAO;
	}
	
	@PostConstruct//创建bean前调用,不管有没有用到bean引用，只要创建就会调用
	public void init(){
		System.out.println("at the begining of JsrService injection...");
	}
	
	@PreDestroy//销毁bean前调用
	public void destroy(){
		System.out.println("in destroying the bean named jsrService...");
	}
	
	public void doSave(){
		jsrDAO.save();
	}
}
