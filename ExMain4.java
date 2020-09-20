package arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ExMain4 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Ex4>al=new ArrayList<>();
		System.out.println("Enter the number of halls:");
		int n=sc.nextInt();
		al.add(new Ex4("lali",999,9000,"AA"));
		al.add(new Ex4("Maria",450,2000,"BB"));
		al.add(new Ex4("Jaquilin",600,5000,"CC"));
		al.add(new Ex4("Renita Sarah",1000,524,"MM"));
		Collections.sort(al,new SortByRoll());
		for(Ex4 t:al) {
			System.out.println(t.getName()+","+t.getNum()+","+t.getCost()+","+t.getOwner());
		}
	}

}
