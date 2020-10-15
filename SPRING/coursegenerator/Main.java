package org.coursegenerator;

import java.io.IOException;

import org.ex.emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws NumberFormatException,IOException {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("coursegenerator.xml");
		Course c1=context.getBean(Course.class,"course1");
		Course c2=context.getBean("course2",Course.class);
		Course c3=context.getBean("course3",Course.class);
			 		
		c1.display(); 
		c2.display(); 
		c3.display();
		((ClassPathXmlApplicationContext)context).close();
		}
}
