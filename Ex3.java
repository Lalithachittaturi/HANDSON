package arraylist;
import java.util.ArrayList;
import java.util.Scanner;
public class Ex3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String>al=new ArrayList<>();
		String s;
		System.out.println("enter number of halls:");
		int n = 0;

		for(int i=0;i<n;i++) {
			System.out.println("Enter the hall name"+(i+1));
			String name=sc.nextLine();
			al.add(name);
		}
		System.out.println("Enter the hallName to be searched:");
		s=sc.nextLine();
		if(al.contains(s))
			System.out.println(s+  "  searched Element is at:"+al.indexOf(s));
		else
			System.out.println("not found");



	}

}
