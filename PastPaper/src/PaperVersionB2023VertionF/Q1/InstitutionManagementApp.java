package PaperVersionB2023VertionF.Q1;

import java.util.*;

public class InstitutionManagementApp {

	public static void main(String[] args) {
		
		
		Teacher t1 = new Teacher(1001, "Lakmali ",new ArrayList<>()) ;
		Teacher t2 = new Teacher(1001, "Lakmali ",new ArrayList<>()) ;
		
		 
		 Course c1 = new Course("C101", "Mathematics")
		{
		
					@Override 
				public void DisplayCourseDetails()
				{
					System.out.println("Course Id " + getCode() );
					System.out.println("Course Name  " + getCoursename() );
				}
		
		};
		
		 Course c2 = new Course("C101", "Mathematics")
		{
		
					@Override 
				public void DisplayCourseDetails()
				{	
					System.out.println("Course Id " + getCode() );
					System.out.println("Course Name  " + getCoursename() );
				}
		
		};
		
		t1.TeachCourses(c1) ;
		t1.TeachCourses(c2) ;
		t2.TeachCourses(c1) ;
			
		
		
		Student S1 = new Student(2000, "Upasara ",new ArrayList<>()) ;
		Student s2 = new Student(2001, "Nadeeja ",new ArrayList<>()) ;
		Student s3 = new Student(2001, "Supun ",new ArrayList<>()) ;
		
		
		S1.EnrollnCourse(c1) ;
		s2.EnrollnCourse(c2) ;
		s3.EnrollnCourse(c2);
		s3.EnrollnCourse(c1);
		
		System.out.println("______________Student Details __________________");
		System.out.println("");
		S1.DisplayDetails();
		System.out.println("");
		s2.DisplayDetails();
		System.out.println("");
		s3.DisplayDetails();
		
		System.out.println("");
		System.out.println("______________Teacher Details __________________");
		System.out.println("");
		t1.DisplayDetails();
		System.out.println("");
		t2.DisplayDetails();
		
		System.out.println("");
		System.out.println("________________________Course Detais __________________");
		c1.DisplayCourseDetails();
		System.out.println("");
		c2.DisplayCourseDetails();
	}

}
