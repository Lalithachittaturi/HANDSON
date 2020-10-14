package org.course;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
	public static void main(String[] args)throws NumberFormatException,IOException {
		CourseList courselist=new CourseList();
		Scanner sc=new Scanner(System.in);
		ArrayList<String> budgetlist=new ArrayList<>();
		ApplicationContext context=new ClassPathXmlApplicationContext("CourseEx.xml");
		Course courses1 = context.getBean(Course.class, "courses1");
		Course courses2 = context.getBean(Course.class, "courses2");
		Course courses3 = context.getBean(Course.class, "courses3");
		double budget;
		System.out.println("Enter the budget:");
		budget=sc.nextDouble();
		courselist.insert(courses1);
		courselist.insert(courses2);
		courselist.insert(courses3);
		budgetlist=courselist.noOfCourse(budget);
		if(budgetlist.isEmpty())
			System.out.println("No courses are Available");
		else {
			for(String values:budgetlist) {
				System.out.println(values);
			}
		}

		((ClassPathXmlApplicationContext)context).close();
	}
}
