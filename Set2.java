package sample;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Set2 {

	public static void main(String[] args) {
		HashSet<String>h=new HashSet<>();
		Scanner sc=new Scanner(System.in);
		char ch1;
		do {
			System.out.println("Enter the name:");
			String name=sc.nextLine();
			h.add(name);
			
			System.out.println("Do u want to continue? :(y or n)");
			ch1 = sc.nextLine().charAt(0);	
		}
			
			while(ch1=='y' || ch1=='Y'); 
			sc.close();
			//System.out.println("the entered names are:");
			//Iterator<String>itr=h.iterator();
			//while(itr.hasNext()) {
				//System.out.println(itr.next());
			//}
			System.out.println("Number of users:"+h.size());
		

	}

}
