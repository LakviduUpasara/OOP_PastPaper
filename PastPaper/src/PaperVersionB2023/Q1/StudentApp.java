package PaperVersionB2023.Q1;

import java.util.*;
public class StudentApp {

	public static void main(String[] args) {
		// ArrayLists restricted to only Student and Course types
		
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<>();

        // Create and read 2 students
        Student s1 = new Student();
        s1.Read();

        
        Student s2 = new Student();
        s2.Read();
        
        students.add(s1);
        students.add(s2);
        
     
        
        // Create and read 2 courses
        Course c1 = new Course();
        c1.Read();
        
      
        Course c2 = new Course();
        c2.Read();
        
        courses.add(c1);
        courses.add(c2);

        // Add students to courses
        c1.Addstudent(s1);
        c1.Addstudent(s2);
        c2.Addstudent(s2);  // Example: s2 is enrolled in both

        // Display all student details
        System.out.println("===== STUDENT DETAILS =====");
        for (Student s : students) {
            s.Print();
            System.out.println("--------------------");
        }

        // Display all course details
        System.out.println("===== COURSE DETAILS =====");
        for (Course c : courses) {
            c.Print();
            System.out.println("==========================");
        }

	}

}
