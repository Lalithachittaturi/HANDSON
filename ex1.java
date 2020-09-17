package arraylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class ex1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch1;
			ArrayList<String> li=new ArrayList<String>();
			System.out.println("enter username1:");
			String name1=sc.nextLine();
			li.add(name1);
			do {
			System.out.println("enter username2:");
			String name2=sc.nextLine();
			li.add(name2);
			System.out.println("Do u want to continue? :(y or n)");
			ch1 = sc.nextLine().charAt(0);	
		}
		while(ch1=='y' || ch1=='Y'); 
		sc.close();
		System.out.println("the entered names are:");
		Iterator<String>itr=li.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}