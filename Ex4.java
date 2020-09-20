package arraylist;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Comparator;

public class Ex4 {
	String name;
	int num;
	int cost;
	String owner;
	public Ex4() {
		
	}
	public Ex4(String name, int num, int cost, String owner) {
		super();
		this.name = name;
		this.num = num;
		this.cost = cost;
		this.owner = owner;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String toString() {
		return name+" "+num+" "+cost+" "+owner;
	}
	}
class SortByRoll implements Comparator<Ex4>{

	@Override
	public int compare(Ex4 o1, Ex4 o2) {
		// TODO Auto-generated method stub
		return -o1.cost+o2.cost;
	}
	
}
