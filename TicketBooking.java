package arraylist;

public class TicketBooking {
	private String customerName;
	private Integer price;
	public TicketBooking() {
		
	}
	public TicketBooking(String customerName, Integer price) {
		super();
		this.customerName = customerName;
		this.price = price;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String toString() {
		return customerName+" "+price;
	}

}
