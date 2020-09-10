package handson;

import java.util.Scanner;

public class ICICI implements MutualFund{
	int years;
	int interest=60;
	int amt;
	int res;
	Scanner sc=new Scanner(System.in);
	@Override
	public void duration() {
		// TODO Auto-generated method stub
		System.out.println("enter duration");
		years=sc.nextInt();		
	}
	@Override
	public void amount() {
		// TODO Auto-generated method stub
		System.out.println("enter amount");
		interest=sc.nextInt();	
	}
	@Override
	public void cal() {
		res=(amt*years*interest)/100;
		System.out.println(res);
		
	}

}
