package practice;
import java.util.Scanner;
public class EmpMain {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		String street,city,state;
		int userId;
		//int n;
		String data;
		//System.out.println("enter the number of users:");
		//n=sc.nextInt();
		//Emp e[]=new Emp[n];
		System.out.println("Enter the datails using comma separated values:");
		String[] arr=new String[4];
		data=sc.nextLine();
		arr=data.split(",");
		//for(int i=0;i<arr.length;i++) {
			userId=Integer.parseInt(arr[0]);
			street=arr[1];
			 city=arr[2];
			state=arr[3];//}
		//System.out.println(arr[i]);
		System.out.format("%-15s %-15s %-15s %s\n", "User ID:"+userId,"Street","City","State");
		
	}

}
