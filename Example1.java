package strings;
import java.util.Scanner;
public class Example1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str1;
		String str2;
		System.out.println("Enter humpty's sentence:");
		str1=sc.nextLine();
		System.out.println("Enter Dumpty's sentence:");
		str2=sc.nextLine();
		System.out.println("Concatenated String:"+str1+"."+str2);
		
	}

}
