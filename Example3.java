package strings;
import java.util.Scanner;
public class Example3 {
	public static void main(String args[]) {
		String str1; 
		String rev = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter humpty's sentence:");
		str1 = in.nextLine();
		int length =str1.length();
		for (int i = length - 1 ; i >= 0 ; i--)
			rev = rev + str1.charAt(i);
		System.out.println("Enter Dumpty's sentence,"  + rev);
	}
}
