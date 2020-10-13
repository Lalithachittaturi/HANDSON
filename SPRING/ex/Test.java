package org.ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("empEx.xml");
		emp e=context.getBean(emp.class,"e");
		System.out.println(e.getEno()+"\t"+e.getEname());
		Address address=e.getAddress();
		System.out.println(address.getCity()+"\t"+address.getCountry());
		((ClassPathXmlApplicationContext)context).close();

	}

}
