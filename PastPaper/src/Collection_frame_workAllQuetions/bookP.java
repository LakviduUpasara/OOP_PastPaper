package Collection_frame_workAllQuetions;

import java.util.PriorityQueue;
import java.util.Scanner;

public class bookP {

	public static void main(String[] args) {
		
		String input ;
		boolean istrue = false ;
		
		
		 PriorityQueue<String > book = new PriorityQueue<String>() ;
		 
		 System.out.println("Enter Bokk Name ");
		 
		 Scanner scanner = new Scanner(System.in) ;
		 
		 input = scanner.nextLine() ;
		 
		 while (!input.equalsIgnoreCase("done"))
		 {
			 
			 book.add(input) ;
			 
			 System.out.println("Enter Bokk Name ");
			 input = scanner.nextLine();
			 
		 }
		 
		 System.out.println(); 
		 System.out.println("Enter Bokk Remove book Name ");
		 String ReInput = scanner.nextLine() ;
		 
		 
		 for (String elements : book) {
			 
			 if (ReInput.equalsIgnoreCase(elements))
			 {
				 book.remove(ReInput);
				 System.out.println("Book Removed Succusfully "); 
				 istrue = true  ;
			 }
			
		 }
		 
		 
		 if (!istrue)
		 {	
			 
			 System.out.println("Name Is not founds "); 
			
		 }
		 
		 
		 System.out.println(); 
		 System.out.println(book);
		 
		 scanner.close();
	}
	
      
	

}
