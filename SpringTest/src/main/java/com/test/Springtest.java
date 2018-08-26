package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Springtest {
  
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	}
}
