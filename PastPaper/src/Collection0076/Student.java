package Collection0076;

public class Student  implements iPerson{

	
	private String Studentid;
	private int grade ;
	
	
	
	
	public Student(String studentid, int grade) {
		super();
		Studentid = studentid;
		this.grade = grade;
	}

	public Student() {
	
		Studentid = null;
		grade = 0;
	}

	public String getStudentid() {
		return Studentid;
	}


	public int getGrade() {
		return grade;
	}


	public void setStudentid(String studentid) {
		Studentid = studentid;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	@Override
	public String displayDetails()
	{
		
		return  "Student Id Is :  " + Studentid + "Grade IS  :" + grade;
	}
	
	
}
