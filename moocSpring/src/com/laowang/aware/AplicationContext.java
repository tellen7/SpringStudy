package com.laowang.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

public class AplicationContext implements ApplicationContextAware {
	
	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;
		System.out.println("myapplicationContextByAware: "+applicationContext.getBean("applicationContext").hashCode());
		this.useApplicationContext();
		
		this.getResource("fileSystem: ","file:D:\\masterSpring\\moocSpring\\src\\spring-scope.xml");
		this.getResource("classpath: ","spring-scope.xml");
		this.getResource("url: ", "url:http://tellenw.top/2017/04/02/%E5%8D%95%E4%BE%8B%E6%A8%A1%E5%BC%8F%E4%BC%98%E5%8C%96%E8%AF%A6%E8%A7%A3/");
	}

	public void useApplicationContext(){
		if(!applicationContext.containsBean("cunzai")){
			System.out.println("通过这种方式获取context可以做一些事情，如判断bean不存在！");
		}
	}
	
	public void getResource(String message, String path){
		//file,classpath(默认),url,...
		Resource resource = applicationContext.getResource(path);
		System.out.println(message+resource);
	}
}
