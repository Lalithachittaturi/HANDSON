package org.hcl;
public class Address {
	private String line1;
	private String line2;
	private String City;
	private String Pincode;
	public Address() {
		
	}
	public Address(String line1, String line2, String city, String pincode) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		City = city;
		Pincode = pincode;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getPincode() {
		return Pincode;
	}
	public void setPincode(String pincode) {
		Pincode = pincode;
	}
	public String toString(){  
	    return line1+"\n"+line2+"\n"+City+"\n"+Pincode;  
	}  
	
}



