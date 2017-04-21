package com.laowang.dao;

public class InjectionDAOImp implements InjectionDAO{

	@Override
	public void save(String arg) {
		System.out.println("保存数据:"+arg);
	}
	
}
