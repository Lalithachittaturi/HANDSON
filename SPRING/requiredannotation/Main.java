package org.requiredannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) throws Exception{
		ApplicationContext context = new ClassPathXmlApplicationContext("required.xml");//For Java based config
		User u = context.getBean(User.class,"user");
		
		Box b = context.getBean(Box.class,"box");
		b.display();
		((ClassPathXmlApplicationContext) context).close();
	}

}
