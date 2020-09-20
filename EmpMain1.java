package practice;
import java.util.Scanner;
public class EmpMain1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userId;
		String street;
		String city;
		String state;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of details:");
		userId=sc.nextInt();
		street=sc.nextLine();
		sc.nextLine();
		city=sc.nextLine();
		sc.nextLine();
		state=sc.nextLine();
		sc.nextLine();
		//Emp e=new Emp(userId,street,city,state);
		//System.out.format("%-10s %-10s %-10s %s\n","Street","City","State");
		//System.out.println("%-15s %-15s %-15s %s\n",userId.getUserId);
		System.out.println("userId\tstreet\tcity\tstate");
		System.out.print(userId);
		System.out.println(street);
		System.out.println(city);
		System.out.println(state);
	}

}
