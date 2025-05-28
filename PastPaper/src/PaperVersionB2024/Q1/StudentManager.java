package PaperVersionB2024.Q1;

import java.util.*;


public class StudentManager {
	
	ArrayList <Student> studentList ;
	
	public StudentManager()
	{	
		studentList = new ArrayList<>() ;
	
	}

	public void addStudent(Student Student)
	{
		
		studentList.add(Student) ;	
	}
	
	public void Serchstudent(int StudentID)
	{
		for (Student Student :studentList  )
		{
			if (Student.getStudentid()== StudentID)
			{
				Student.displayStudentDetails();;
			}
		}
	}
	
	public void updatestudentgpa(int StudentID , double gpa)
	{	
		
		for (Student Student : studentList  )
		{
			if (Student.getStudentid()== StudentID)
			{
				boolean  result = (boolean) Student.updateGPA(gpa);
				
				if (result == true )
				{
					System.out.println("GPA Upadate sucessfully : Student Id " + StudentID + "Gapa IS " + gpa );
				}
			}
		}
	}
	
	public void displayAllstudent()
	{
		
		System.out.println("_______________All Student Details Is  ___________________");
		
		for (Student Student :studentList  )
		{
				Student.displayStudentDetails();;
				
				System.out.println("__________________________________");
			
		}
	}

}
