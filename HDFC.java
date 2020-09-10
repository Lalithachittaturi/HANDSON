package handson;

import java.util.Scanner;

public class HDFC implements MutualFund{
	int years;
	int interest=49;
	int amt;
	int res;
	Scanner sc=new Scanner(System.in);
	@Override
	public void amount() {
		// TODO Auto-generated method stub
		System.out.println("enter years");
		years=sc.nextInt();	
	}
	@Override
	public void duration() {
		// TODO Auto-generated method stub
		System.out.println("enter duration");
		years=sc.nextInt();
		
	}
	@Override
	public void cal() {
		// TODO Auto-generated method stub
		res=(amt*years*interest)/100;
		System.out.println(res);
		
	}


}
