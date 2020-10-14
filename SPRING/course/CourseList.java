package org.course;
import java.util.ArrayList;
public class CourseList {
	private ArrayList<Course>courseList=new ArrayList();

	/*
	 * public CourseList() { } public CourseList(ArrayList<Course> courseList) {
	 * super(); this.courseList = courseList; } public ArrayList<Course>
	 * getCourseList() { return courseList; } public void
	 * setCourseList(ArrayList<Course> courseList) { this.courseList = courseList; }
	 */	
	public void insert(Course course) {
		//System.out.println(course);
		courseList.add(course);
	}
	public ArrayList<String>noOfCourse(double budget){
		
		/*
		 * ArrayList<String> noOfC=new ArrayList<>(); for(Course course:this.courseList)
		 * { if(course.getFee()==budget) { String message=course.getName()+"-1";
		 * noOfC.add(message);
		 * 
		 * }else if(course.getFee()<budget) { double fee=course.getFee(); double
		 * bud=budget; int no=(int)(bud/fee); String message=course.getName()+"-"+no;
		 * noOfC.add(message); } } return noOfC;
		 */		  
		 ArrayList<String>no=new ArrayList<>();
		 for(Course course:courseList) {
			 if(budget>=course.getFee()) {
				 no.add(course.getName()+"-"+(int)(budget/course.getFee()));
				 
			 }
		 }
		return no;
		
	}
	public ArrayList<Course>getCourseList(){
		return courseList;
	}
	public void setCourseList(ArrayList<Course>courseList) {
		this.courseList=courseList;
	}
}
