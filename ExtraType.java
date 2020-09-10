package com.hcl;

public class ExtraType {
	private String name;
	private long runs;
	ExtraType(){
		
	}
	public ExtraType(String name, long runs) {
		super();
		this.name = name;
		this.runs = runs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getRuns() {
		return runs;
	}
	public void setRuns(long runs) {
		this.runs = runs;
	}

}
