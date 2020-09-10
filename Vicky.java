package abc;
import java.io.*;
import java.util.Scanner;
public class Vicky {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int n;
			int div;
			int cal;
			Scanner s = new Scanner(System.in);
			System.out.print("Enter no. of elements you want in array:");
			n = s.nextInt();
			int a[] = new int[n];
			System.out.println("Enter all the elements:");
			for(int i = 0; i < a.length; i++)
			{
				a[i] = s.nextInt();
			}
			System.out.println("Enter divisor:");
			div=s.nextInt();
			for(int j=0;j<n;j++) {
				cal=a[j]%div;
				System.out.println("result:"+cal);
			}
		}catch(ArithmeticException ae) {
			System.out.println("can not divide by zero");
		}

	}
}


