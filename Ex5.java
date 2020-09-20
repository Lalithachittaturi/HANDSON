package arraylist;

import java.util.List;

public class Ex5 {
	private String name;
	private String detail;
	private String type;
	private String ownerName;
	public Ex5() {
		
	}
	public Ex5(String name, String detail, String type, String ownerName) {
		super();
		this.name = name;
		this.detail = detail;
		this.type = type;
		this.ownerName = ownerName;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String display(List<Ex5> al) {
		return name+" "+detail+" "+type+" "+ownerName;		
	}
	public void removeTest(List<Ex5> al) {
		// TODO Auto-generated method stub
		
	}

}
