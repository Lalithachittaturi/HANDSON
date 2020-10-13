package org.hcl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("AddressApplicationContect.xml");
		Employee emp = context.getBean(Employee.class, "emp");
		/*
		 * System.out.println("Name:"+(emp).getEmployeeName());
		 * 
		 * System.out.println("The contact numbers are");
		 * 
		 * System.out.println( emp.getEmployeeMobileNumber() + "\n" +
		 * emp.getEmployeeEmail() + "\n" + emp.getEmployeeSalary());
		 * 
		 * System.out.println("Address is:");
		 * 
		 * Address address = (emp).getAddress();
		 * 
		 * System.out.println(address.getLine1()+"\n"+address.getLine2()+"\n"
		 * +address.getCity()+"\n"+address.getPincode());
		 * ((ClassPathXmlApplicationContext)context).close();
		 */		
		emp.displayInfo(); 
		((ClassPathXmlApplicationContext)context).close();
	}

}
