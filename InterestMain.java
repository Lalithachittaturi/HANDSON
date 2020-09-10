package handson;
import java.util.Scanner;
public class InterestMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Axis");
		System.out.println("2.Hdfc");
		System.out.println("3.Icici");
		int ch=sc.nextInt();
		MutualFund m=new AxisBank();
		MutualFund m1=new HDFC();
		MutualFund m2=new ICICI();
		if (ch==1) {
			m.amount();
			m.duration();
			System.out.print("Aixs bank:");
			m.cal();}
		if(ch==2) {
			m1.amount();
			m1.duration();
			m1.cal();}
		if(ch==3) {
			m2.amount();
			m2.duration();
			m2.cal();}
	}

}
