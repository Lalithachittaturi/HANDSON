package strings;
import java.util.Scanner;
public class TestMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String street,city,country;
		String data;
		String[] arr=new String[3];
		System.out.println("Enter the details:");
		System.out.println("Enter address '1' details:");
		data=sc.nextLine();
		Test t=new Test();
		arr=data.split(",");
		street=arr[0];
		city=arr[1];
		country=arr[2];
		t.setStreet(street);
		t.setCity(city);
		t.setCountry(country);
		System.out.println("Enter address '2' details:");
		data=sc.nextLine();
		Test t1=new Test(street,city,country);
		arr=data.split(",");
		street=arr[0];
		city=arr[1];
		country=arr[2];
		t1.setStreet(street);
		t1.setCity(city);
		t1.setCountry(country);
		//System.out.println(t.equals(t1));
		//System.out.println("RED");
		if(t.equals(t1))  {
			System.out.println("RED");
		}else {
			System.out.println("GREEN");
		}

	}
}
