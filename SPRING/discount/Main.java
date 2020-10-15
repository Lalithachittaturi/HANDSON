package org.discount;
import java.io.IOException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		CourseList1 courselist=new CourseList1();
		
		ApplicationContext context=new ClassPathXmlApplicationContext("DiscountConfig.xml");
		Course1 course1=context.getBean("courses1",Course1.class);
		Course1 course2=context.getBean("courses2",Course1.class);
		Course1 course3=context.getBean("courses3",Course1.class);
		courselist.insert(course1);
		courselist.insert(course2);
		courselist.insert(course3);
		courselist.discount();
		
		((ClassPathXmlApplicationContext)context).close();
		
	}

}