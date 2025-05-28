package PaperVersionB2023.Q1;

import java.util.*;

public class Course extends Student {
	
	
	private String courseid ;
	private String coursename ;
	private String instructor ;
	
	private ArrayList <Student> enrolledStudents ;
	
	public Course() {
	
		
		this.courseid = null;
		this.coursename = null;
		this.instructor = null;
		this.enrolledStudents = new ArrayList<>();
	}

	public Course(String courseid, String coursename, String instroctor, ArrayList<Student> enrolledStudents) {
	
		
		this.courseid = courseid;
		this.coursename = coursename;
		this.instructor = instructor;
		this.enrolledStudents = enrolledStudents;
	}
	
	public void Addstudent(Student student )
	{
		
		enrolledStudents.add(student) ;
		
	}
	
	public void Read()
	{
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Course Details:");
        
        
        System.out.print("Course ID: ");
        courseid = scanner.nextLine();
      
        
        System.out.print("Course Name: ");
        coursename = scanner.nextLine();
        
        
        System.out.print("Instructor: ");
        instructor = scanner.nextLine();
        
        System.out.println(); 
        System.out.println("________________________");
       
        
	}
	
	public void Print() {
        System.out.println("Course Details:");
        System.out.println("Course ID: " + courseid);
        System.out.println("Course Name: " + coursename);
        System.out.println("Instructor: " + instructor);
        System.out.println("Enrolled Students:");
       
        if (enrolledStudents.isEmpty()) 
        {
            System.out.println("  No students enrolled.");
            
        } else {
            for (Student student : enrolledStudents) {
                System.out.println(student.getName());
            }
        }
    }
	
	
	
	
	
	
	

}
