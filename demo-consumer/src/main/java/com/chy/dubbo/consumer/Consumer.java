package com.chy.dubbo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chy.dubbo.test.DemoService;

public class Consumer {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ctx.start();
		DemoService demoService = (DemoService) ctx.getBean("demoService");
		System.out.println(demoService.sayHello("tom"));
	}

}
