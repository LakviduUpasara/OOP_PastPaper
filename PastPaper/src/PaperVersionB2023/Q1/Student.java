package PaperVersionB2023.Q1;

import java.util.* ;
public class Student {
	
	
	private String  Studentid ;
	private String name ;
	private String address ;
	private String contactnumber ;
	
	
	public Student() {
		super();
		Studentid = null;
		this.name = null;
		this.address = null;
		this.contactnumber = null;
	}
	
	public Student(String studentid, String name, String address, String contactnumber) {
		super();
		Studentid = studentid;
		this.name = name;
		this.address = address;
		this.contactnumber = contactnumber;
	}

	public String getStudentid() {
		return Studentid;
	}

	public void setStudentid(String studentid) {
		Studentid = studentid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}

	public void Read()
	{
		
		Scanner scanner = new Scanner (System.in) ;
		
		//get id
		System.out.print("Enter Student ID : ");
		Studentid = scanner.nextLine(); 
		
		//get name 
		
		System.out.print("Enter Student name : ");
		name = scanner.nextLine(); 
		
		
		//address 
		System.out.print("Enter Student Address : ");
		address = scanner.nextLine(); 
	
		//contactNumber
		System.out.print("Enter Student Contact Number : ");
		contactnumber = scanner.nextLine(); 
		
		  System.out.println(); 
	      System.out.println("________________________");
		
	}
	
	public void Print()
	{
		
		
		//print id
		System.out.println(" Student ID Is : " + Studentid );
		
		
		//get name 
		System.out.println("Student name : " +name);
	
		
		//address 
		System.out.println(" Student address  : " +address);
		
		
		//contactNumber
		System.out.println(" Student contact number : " +contactnumber);
		
	}
	
	

}
