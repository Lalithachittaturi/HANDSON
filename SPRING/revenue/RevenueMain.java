package org.revenue;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RevenueMain {
	public static void main(String[] args) throws NumberFormatException, IOException {

		CourseList courselist=new CourseList();

		ApplicationContext context=new ClassPathXmlApplicationContext("Revenue.xml");
		Course course1=context.getBean("courses1",Course.class);
		Course course2=context.getBean("courses2",Course.class);
		Course course3=context.getBean("courses3",Course.class);
		courselist.insert(course1);
		courselist.insert(course2);
		courselist.insert(course3);
		System.out.println("Total Revenue is:");
		System.out.println(courselist.revenue());

		((ClassPathXmlApplicationContext)context).close();

	}

}

