package Inheritance;

import java.util.Scanner;

public class Stall {
	protected String name;
	protected String detail;
	protected String ownername;
	protected String tv;
	//public String price;
	public Stall() {

	}	
	public Stall(String name, String detail, String ownername,String tv) {
		super();
		this.name = name;
		this.detail = detail;
		this.ownername = ownername;
		this.tv=tv;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public String getTv() {
		return tv;
	}
	public void setTv(String tv) {
		this.ownername = ownername;
	}

	public double computeCost(String stallType, Integer squareFeet) {
		double price;
		if(stallType.equals("PLATINUM")) {
			price=squareFeet*200;
			return price;
		}
		else if(stallType.equals("DIAMOND")) {
			price=squareFeet*150;
			return price;
		}
		else {
			price=squareFeet*100;
			return price;

		}
	}
	public double computeCost(String stallType,Integer squareFeet,Integer noOfTv) {
		double price;
		if(stallType.contentEquals("PLATINUM")){
			price=((squareFeet*200)+noOfTv*10000);
			return price;
		}
		else if(stallType=="DIAMOND") {
			price=((squareFeet*150)+(noOfTv*10000));
			return price;
		}
		else{
			price=((squareFeet*100)+(noOfTv*10000));
			return price;
		}
		
	}

}
