package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Springtest {
  
	public static void main(String[] args) {
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		User bean = context.getBean(User.class);
		HellSpring hellSpring = context.getBean(HellSpring.class);
		System.out.println(bean);
	}
}
