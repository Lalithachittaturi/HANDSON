package org.tech;

import java.util.Set;

public class Instructor {
		private int id;
		private String name;
		private Set<Technology> technologies;
		public Instructor() {
			
		}
		public Instructor(int id, String name, Set<Technology> technologies) {
			super();
			this.id = id;
			this.name = name;
			this.technologies = technologies;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Set<Technology> getTechnologies() {
			return technologies;
		}
		public void setTechnologies(Set<Technology> technologies) {
			this.technologies = technologies;
		}
		
	}
