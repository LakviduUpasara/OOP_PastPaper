package PaperVersionB2024.Q1;

public class Student {
	
	private  int studentid ;
	private String name ;
	private int age ;
	private String major ; 
	private double gpa ;
	
	public Student()
	{
		this.studentid = 0;
		this.name = null;
		this.age = 0;
		this.major = null;
		this.gpa = 0.0;
	}
	
	public Student(int studentid, String name, int age, String major, double gpa) {
	
		this.studentid = studentid;
		this.name = name;
		this.age = age;
		this.major = major;
		this.gpa = gpa;
	}

	public int  getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	
	
	public boolean updateGPA(double newGpa) {
		
		this.gpa = newGpa ;
		
		return true ;
		
	}
	


	public void displayStudentDetails() {
		// TODO Auto-generated method stub
		
		
		System.out.println("This Is Sthudent Details  :");
		System.out.println("");
		
		System.out.println("Student Id is      : " +studentid );
		System.out.println("Studenet Name Is   : " + name);
		System.out.println("Student  Age       : " +age );
		System.out.println("Student major is   : " +major );
		System.out.println("Student Gpa is     : " +gpa );
		
	}

	
	
	
	
	
	
	
	
	
	

}
