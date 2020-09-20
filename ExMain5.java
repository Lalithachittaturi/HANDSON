package arraylist;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class ExMain5 {
	private static Object test;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		List<Ex5>al=new ArrayList<>();
		System.out.println("Enter the number of details:");
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			System.out.println("Enter the type name"+(i+1));
			String data=br.readLine();
			String array[]=data.split(",");
			Ex5 e=new Ex5(array[0],array[1],array[2],array[3]);
			al.add(e);
		}/*System.out.println("Before reversing:");
		for(Ex5 a:al) {
			System.out.println(a.getName() + " " + 
					a.getDetail() + " " + " "+a.getOwnerName()+" "+
					a.getType()); 
		}*/
		Collections.reverse(al);
		System.out.println("User details in reverse order");
		System.out.println("Name\tDetail\tOwnerName\tType");
		for(Ex5 a:al) {
			System.out.println(a.getName() + " " + 
					a.getDetail() + " " + " "+a.getOwnerName()+" "+
					a.getType()); 
		}
	}
}