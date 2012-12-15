package com.gengfo;

import java.beans.Beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Todo in chapter 4
 * @author Administrator
 *
 */
public class AnnotationApplicationContext {

	 public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Beans.class);
		Car car =ctx.getBean("car",Car.class);
	}
}
