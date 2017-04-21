package com.laowang.annotationBase;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath*:spring-annotationBase.xml")//这个必须要引入，否者得到配置文件中的值是有问题的，有了这个可以不用在JsrDAO中重配置了，多了也无妨
public class JavaConfig {

	@Bean(name="dao", initMethod="init", destroyMethod="destroy")
	public JsrDAO getJseDAO(){
		return new JsrDAO();
	}
	
	@Bean
	public JsrService getJsrService(){
		JsrService service =new JsrService();
		service.setJsrDAO(getJseDAO());
		return service;
	}
	
}
