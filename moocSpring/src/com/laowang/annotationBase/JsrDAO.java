package com.laowang.annotationBase;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("dao")
//@ImportResource("classpath*:jdbc.properties")
//@ImportResource("classpath*:spring-annotationBase.xml")
public class JsrDAO {
	
	@Value("${url}")//加载配置文件中key为url的value值注入
	private String url;
	
	@Value("${name}")
	private String name;
	
	@Value("${password}")
	private String password;
	
	public void save(){
		System.out.println("jsr saving...");
		System.out.println("url: "+url);
		System.out.println("name: "+name);
		System.out.println("password: "+password);
	}
	
	public void init(){
		System.out.println("init jsrDAO Bean ...");
	}
	
	public void destroy(){
		System.out.println("destroy jsrDAO Bean ...");
	}
}
