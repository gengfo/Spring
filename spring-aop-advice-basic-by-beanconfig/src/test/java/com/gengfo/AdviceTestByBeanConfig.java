package com.gengfo;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdviceTestByBeanConfig extends TestCase{
	public  void testAdvise() {
		String configPath = "beans.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
		Waiter waiter = (Waiter) ctx.getBean("waiter");
		waiter.greetTo("John");
		waiter.serveTo("John");
		//waiter.greetTo("Tom");
	}
}
