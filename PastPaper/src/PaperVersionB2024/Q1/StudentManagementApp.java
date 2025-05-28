package PaperVersionB2024.Q1;

public class StudentManagementApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentManager student_man1 = new StudentManager();
		
		
		student_man1.addStudent(new Student (1 ,"Alice" ,20,"Computer Sience " ,3.5));
		student_man1.addStudent(new Student (2 ,"Supun" ,20,"Computer Sience " ,3.5));
		student_man1.addStudent(new Student (3 ,"Nadeeja" ,20,"Computer Sience " ,3.5));
		student_man1.addStudent(new Student (4 ,"Dualan" ,20,"Computer Sience " ,3.5));
		student_man1.addStudent(new Student (5 ,"Oshan" ,20,"Computer Sience " ,3.5));
		
		student_man1.updatestudentgpa(3, 4.5 );
		
		
		System.out.println("________________Search Student From Id  _______________");
		
		System.out.println();
		
		student_man1.Serchstudent(5); ;
		
		System.out.println();
		
		
		student_man1.displayAllstudent() ;
		

	}

}
