package com.laowang.aopx;

import org.springframework.stereotype.Service;

@Service
public class ServiceMine {

	public String say(){
		return "Hello! this is in serviceMine.say()...";
	}
	
	public void save(){
		System.out.println("this is save...");
	}
	
	public void throwing() {
		throw new RuntimeException("saving failed...");
	}
}
