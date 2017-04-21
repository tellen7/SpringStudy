package com.laowang.service;

import com.laowang.dao.InjectionDAO;

public class InjectionServiceImp implements InjectionService{
	
	private InjectionDAO injectionDao;
	
	//设值方法注入(setter注入)
	public void setInjectiondao(InjectionDAO inectiondao) {
		this.injectionDao = inectiondao;
	}


	@Override
	public void save(String arg) {
		System.out.println("service接受参数:"+arg);
		arg = arg + this.hashCode();
		injectionDao.save(arg);
	}

}
