package handson;
import java.util.Scanner;
public class Main {
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		String details;
		String StallName,OwnerName;
		int Cost,Projector,Screen,tvSet;
		String data[]=new String[4];
		System.out.println("choose stall type");
		System.out.println("1.Gold Stall");
		System.out.println("2.Premium Stall");
		System.out.println("3.Executive Stall");
		Stall ss=new GoldStall();
		Stall ss1=new PremiumStall();
		Stall ss2=new ExecutiveStall();
		int ch=sc.nextInt();
		if(ch==1) {
			ss.display();
		}
		if(ch==2) {
			//ss1.display();
		}
		if(ch==3) {
			//ss2.display();
		}

	}
}
