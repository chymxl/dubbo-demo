package com.chy.dubbo.test;

public class DemoServiceImpl implements DemoService{

	public String sayHello(String name) {
		return String.format("Hello %s", name);
	}

}
