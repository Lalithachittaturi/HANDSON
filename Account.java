package Inheritance;

public class Account {
	protected String AccNo;
	protected String AccName;
	protected String bankName;
	public Account() {
		super();
	}


	public Account(String accNo, String accName, String bankName, String orgName) {
		super();
		this.AccNo = accNo;
		this.AccName = accName;
		this.bankName = bankName;
	}

	public String getAccNo() {
		return AccNo;
	}
	public void setAccNo(String accNo) {
		AccNo = accNo;
	}
	public String getAccName() {
		return AccName;
	}
	public void setAccName(String accName) {
		AccName = accName;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	protected void display() {

		System.out.println("Account:"+getAccNo());
		System.out.println("Account:"+getAccName());
		System.out.println("Account:"+getBankName());
	}
}
