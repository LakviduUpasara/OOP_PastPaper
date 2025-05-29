package PaperVersionB2023.Q2;

import java.util.* ;

public class main {

	public static void main(String[] args) {
		
		ArrayList< Integer> Oddnumber = new ArrayList<Integer>() ;
		
		Scanner scanner  = new Scanner(System.in) ;
		
		int input ;
		
		do {
			
			System.out.println("Enter Any Number  ");
			input = scanner.nextInt() ;
			
			if (input >= 0 )
			{
				Oddnumber.add(input) ;
			}
			else 
			{
				System.out.println("Input Is a Negative Value ");
			}
			
		}while (input != 0 );
		
		Oddnumber.removeIf(n ->  n % 2 == 0 );
		
		System.out.println("This is Odd Numbers ");
		System.out.println(Oddnumber); 

	}

}
