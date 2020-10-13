package org.tech;

public class Technology {

		private int tid;
		private String name;
		private String description;
		private double fee;
		public Technology() {
			// TODO Auto-generated constructor stub
		}
		public Technology(int tid, String name, String description, double fee) {
			super();
			this.tid = tid;
			this.name = name;
			this.description = description;
			this.fee = fee;
		}
		public int getTid() {
			return tid;
		}
		public void setTid(int tid) {
			this.tid = tid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public double getFee() {
			return fee;
		}
		public void setFee(double fee) {
			this.fee = fee;
		}
		
	}

