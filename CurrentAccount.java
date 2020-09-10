package Inheritance;

public class CurrentAccount extends Account {
	protected String TinNumber;
	public CurrentAccount() {
		super();
	}
	public CurrentAccount(String accNo, String accName, String bankName,String TinNumber) {
		super(accName, accNo, bankName, TinNumber);

		this.TinNumber=TinNumber;
	}
	public String getTinNumber() {
		return TinNumber;
	}
	public void setTinNumber(String tinNumber) {
		TinNumber = tinNumber;
	}
	public void display() {
		super.display();
		System.out.println("TinNumber:"+getTinNumber());
	}


}
