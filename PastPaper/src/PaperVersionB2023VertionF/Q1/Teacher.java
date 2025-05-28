package PaperVersionB2023VertionF.Q1;

import java.util.ArrayList;

public class Teacher extends Person {

	ArrayList<Course> TeachCourses ;
	
	public Teacher() {
		super();
		TeachCourses =  new ArrayList<>();
	}
	
	

	public Teacher(int id, String name ,ArrayList<Course> teachCourses) {
		super(id, name);
		TeachCourses = teachCourses;
	}


	public void TeachCourses(Course c )
	{
		TeachCourses.add(c) ;
	}
	
	@Override
	public void DisplayDetails() {
		
		
		
		System.out.println("Student Id Is : "  + Id);
		System.out.println("Student Id Is : "  + name);
		
		for (Course c : TeachCourses  )
		{
			System.out.println("Course Name is " +c .getCoursename()); 
		}
		
		
		
	}

}
