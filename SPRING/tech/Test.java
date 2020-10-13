package org.tech;
import java.util.List;
import java.util.Set;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("instructorAppContext.xml");
		Instructor instructor=context.getBean(Instructor.class,"instructor");
		Set<Technology> technologies=instructor.getTechnologies();
		System.out.println(instructor.getId()+"\t"+instructor.getName());
		System.out.println("The technologies are");
		for(Technology technology:technologies)
		{
			System.out.println(technology.getName()+"\t"+technology.getDescription());
		}
	}

}
