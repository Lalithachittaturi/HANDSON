package handson;

import java.util.Scanner;

public class AxisBank implements MutualFund {
	int years;
	int interest=56;
	int amt;
	int res;
	Scanner sc=new Scanner(System.in);
	@Override
	public void amount() {
		// TODO Auto-generated method stub
		System.out.println("enter the amount");
		//interest= sc.nextInt(); 	
		amt=sc.nextInt();
		
		//System.out.println(res);
		}
	@Override
	public void duration() {
		// TODO Auto-generated method stub
		System.out.println("enter duration of years");
		years=sc.nextInt();	
	}public void cal() {
		res=(amt*years*interest)/100;
		System.out.println(res);
	}

}
