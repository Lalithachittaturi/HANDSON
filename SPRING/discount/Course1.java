package org.discount;
import java.util.ArrayList;
public class Course1 {

	private String name,mentor;
	private double fee;
	public Course1() {
	}
	public Course1(String name, String mentor, double fee) {
		super();
		this.name = name;
		this.mentor = mentor;
		this.fee = fee;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMentor() {
		return mentor;
	}
	public void setMentor(String mentor) {
		this.mentor = mentor;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	
}