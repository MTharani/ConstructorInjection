package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) 
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		Employee e1=(Employee) ctx.getBean("eob");
		e1.diplay();
		Employee e2=(Employee) ctx.getBean("eob1");
		e2.diplay();

	}

}
