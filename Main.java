package Inheritance;

import java.util.Scanner;

import com.hcl.Product;

public class Main {

	public static void main(String[] args) {
		Account a=new Account();

		System.out.println("Enter the Account details:");
		Scanner s=new Scanner(System.in);
		System.out.println(",");
		
		String AccNo;
		String AccName;
		String bankName;
		String orgName;
		String TinNumber;

		System.out.println("1. SavingsAccount");
		System.out.println("2. CurrentAccount");

		int choice=s.nextInt();
		if(choice==1) {
			SavingsAccount sa=new SavingsAccount();
			System.out.print("Holder Name:");
			sa.setAccName(AccName=s.nextLine());
			s.nextLine();
			System.out.print("Account Number:");
			sa.setAccNo(AccNo=s.nextLine());
			System.out.print("Bank Name:");
			sa.setBankName(bankName=s.nextLine());
			System.out.print("Organisation Name:");
			sa.setOrgName(orgName=s.nextLine());
			//sa.display();
		}
		if(choice==2) {
			CurrentAccount ca=new CurrentAccount();
			System.out.print("Holder Name");
			ca.setAccName(AccName=s.nextLine());
			s.nextLine();
			System.out.print("Account Number:");
			ca.setAccNo(AccNo=s.nextLine());
			System.out.print("Bank Name:");
			ca.setBankName(bankName=s.nextLine());
			System.out.print("Tin Number:");
			ca.setTinNumber(TinNumber = s.nextLine());
			//ca.display();
		}
		
	}
}
