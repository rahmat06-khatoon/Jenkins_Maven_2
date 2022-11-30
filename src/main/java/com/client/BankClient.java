package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.service.BankService;

public class BankClient {

	public static void main(String[] args) {
		
		//ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		
		//ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		  BankService bs=(BankService)ctx.getBean("service");
		  
		  
		  System.out.println(bs.service(6845));
		  
		 
		
	}

}
