package Collection0076;

public class Lecturer implements iPerson{
	
	private String Employeeid ;
	private String deparment ;
	
	
	public Lecturer(String employeeid, String deparment) {
		super();
		Employeeid = employeeid;
		this.deparment = deparment;
	}
	
	public Lecturer() {

		Employeeid = null;
		deparment = null;
	}

	public String getEmployeeid() {
		return Employeeid;
	}

	public String getDeparment() {
		return deparment;
	}

	public void setEmployeeid(String employeeid) {
		Employeeid = employeeid;
	}

	public void setDeparment(String deparment) {
		this.deparment = deparment;
	}
	
	public String displayDetails()
	{
		
		return  "Employee   Id Is :  " + Employeeid + " Deparment  :" + deparment;
	}
	
	
	

}
