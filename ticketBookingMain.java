package arraylist;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class ticketBookingMain{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<TicketBooking>al=new ArrayList<>();
		System.out.println("Enter the number of details:");
		int n=sc.nextInt();
		al.add(new TicketBooking("Jenny", 1200));
		al.add(new TicketBooking("Maria",450));
		al.add(new TicketBooking("Jaquilin",600));
		al.add(new TicketBooking("Renita Sarah",150));

		for(TicketBooking t:al) {
			System.out.println(t.getCustomerName()+","+t.getPrice());
		}

		TicketBooking max=Collections.max(al,new Test());
		TicketBooking min=Collections.min(al,new Test());
		System.out.println("Max amount spent:"+max);
		System.out.println("Min amount spent:"+min);
	}
}
class Test implements Comparator<TicketBooking>{
	@Override
	public int compare(TicketBooking o1, TicketBooking o2) {
		// TODO Auto-generated method stub
		return o1.getPrice().compareTo(o2.getPrice());
	}

}





