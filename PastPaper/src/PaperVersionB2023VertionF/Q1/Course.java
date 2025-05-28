package PaperVersionB2023VertionF.Q1;

public abstract class Course  {
	
	
	protected String code;
	protected String coursename ;
	
	
	public Course() {
	
		this.code = null;
		this.coursename = null;
	}
	
	public Course(String code, String coursename) {
		super();
		this.code = code;
		this.coursename = coursename;
	}



	public String getCode() {
		return code;
	}



	public String getCoursename() {
		return coursename;
	}



	public void setCode(String code) {
		this.code = code;
	}



	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}



	public abstract void DisplayCourseDetails();
	

}
