package PaperVersionB2023VertionF.Q1;

import java.util.*;

public class Student extends Person  {

	ArrayList<Course> enrolledCourses ;
	
	
	

	public Student() {
		super();
		this.enrolledCourses = new ArrayList<>();
	}
	
	


	public Student(int id, String name ,ArrayList<Course> enrolledCourses) {
		super(id, name);
		this.enrolledCourses = enrolledCourses ;
	}






	public void EnrollnCourse(Course c )
	{
		enrolledCourses.add(c) ;
	}
	
	



	@Override
	public void DisplayDetails() {
		
	
		
		System.out.println("Student Id Is : "  + Id);
		System.out.println("Student Id Is : "  + name);
		
		for (Course c : enrolledCourses  )
		{
			System.out.println("Course Name is " +c .getCoursename()); 
		}
		
		
	}

}
