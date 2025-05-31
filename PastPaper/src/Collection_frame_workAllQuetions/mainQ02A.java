package Collection_frame_workAllQuetions;

import java.util.*;

public class mainQ02A {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in) ;
		
		ArrayList <String > employee =new ArrayList<>() ;
		String input ;
		
		boolean istrue = false  ;
		do 
		{
			
			System.out.println("Enter Name ");
			input = scanner.nextLine() ;
			
			if (input.toLowerCase().equals("done"))
			{
				
				break;
				
			}
			
			employee.add(input) ;
			
			
			
		}while(!input.toLowerCase().equals("done")) ;
		
		
		System.out.println(" Enter Remove Employee Name ");
		
		String Reinput = scanner.nextLine() ;
		
		for (String name :employee  )
		{
			 if (name.equalsIgnoreCase(Reinput)) {
				 
				 employee.remove(name) ;
				 
				 System.out.println("Succufull Remove");
				 
				  istrue =true  ;
				 	 
				 break ;
				
			 }
			 
			 
			 
		}
		
		System.out.println("Total Number Of Employee " + employee.size());
		
		System.out.println();
		if (!istrue)
		{
			System.out.println( Reinput + "   Name is Not Founds ");
		}
		
		
		System.out.println();
		System.out.println(employee);
		
		scanner.close();
	}
	
	

}
