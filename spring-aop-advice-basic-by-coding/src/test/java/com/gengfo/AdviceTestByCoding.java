package com.gengfo;

import junit.framework.TestCase;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

public class AdviceTestByCoding extends TestCase {

	public void testGreetingBeforeAdvice() {
		Waiter target = new NaiveWaiter();
		BeforeAdvice beforeAdvice = new GreetingBeforeAdvice();
		//AfterAdvice afterAdvice = new GreetingAfterAdvice();

		ProxyFactory pf = new ProxyFactory();
		pf.setInterfaces(target.getClass().getInterfaces());

		// pf.setOptimize(false);
		pf.setOptimize(true);
		pf.setTarget(target);
		pf.addAdvice(beforeAdvice);
		//pf.addAdvice(afterAdvice);

		Waiter proxy = (Waiter) pf.getProxy();
		proxy.greetTo("John");
		proxy.serveTo("John");
		// proxy.serveTo("Tom");
	}
}
