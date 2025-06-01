package Collection0076;

import java.util.ArrayList;

import PaperVersionB2022.Q1.Lec;

public class GenericpersonDeno {

	public static void main(String[] args) {
		
		 ArrayList<Student>  students  =  new  ArrayList<>();
		 
		 
		 students.add(new  Student("STD1111",   6));
		 students.add(new  Student("STD2222",   7));
		 students.add(new  Student("STD3333",   12));
		 students.add(new  Student("STD4444",   11));
		 students.add(new  Student("STD5555",   10));
		 students.add(new  Student("STD6666",   9));
		 
		 
		 ArrayList<Lecturer> lecturers  =  new  ArrayList<>();
		 
		 lecturers.add(new Lecturer("LEC001", "IT")) ;
		 lecturers.add(new Lecturer("LEC002", "CS")) ;
		 lecturers.add(new Lecturer("LEC003", "DSA")) ;
		 lecturers.add(new Lecturer("LEC004", "SE")) ;
		 lecturers.add(new Lecturer("LEC005", "Cyber")) ;
		 
		 GenaricPerson newperson = new GenaricPerson() ;
		 
		 //
		 
		 System.out.println("_______________Lecter  Details________________ ");
		 newperson.desplayElements(lecturers);
		 
		 System.out.println();
		 System.out.println("____________Student Details___________________ ");
		 newperson.desplayElements(students);
		 
	}

}
