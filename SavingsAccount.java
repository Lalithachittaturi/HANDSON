package Inheritance;

public class SavingsAccount extends Account {
	protected String orgName;
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(String accNo, String accName, String bankName, String orgName) {
		super(accNo, accName, bankName, orgName);
		// TODO Auto-generated constructor stub
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public void display() {
		super.display();
		System.out.println("Organisation name:"+getOrgName());
	}

}
