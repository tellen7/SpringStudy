package com.laowang.aopy;

public class FilterImpl implements Filter {

	@Override
	public void filter() {
		System.out.println("成功给匹配的bean指定了实现接口filter的父类");
		System.out.println("接下来就可以将bean强转为filter接口引用的对象，调用实现类中实现方法");
	}

}
