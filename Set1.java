package sample;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
public class Set1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			System.out.println("the entered names are:");
			Iterator<String>itr=h.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		
	}
}
