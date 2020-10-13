package org.ex;

public class emp {
	private String eno;
	private String ename;
	private Address address;
	public emp() {
		
	}
	public emp(String eno, String ename, Address address) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.address = address;
	}
	public String getEno() {
		return eno;
	}
	public void setEno(String eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
