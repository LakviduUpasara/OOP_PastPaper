package Collection_frame_workAllQuetions;

public class MainApp {

	public static void main(String[] args) {
		
		Integer [] array1 = {2 ,4 ,8,9 } ;
		Genericcalculator num = new Genericcalculator() ;
		
		 Integer valmax =num.calculateMaximum(array1); 
		 
		 double Mulfyallelements = num.calculateproduct(array1) ;
		 
		 System.out.println("Max Walue Is " + valmax );
		 
		 System.out.println();
		 
		 System.out.println("Total product Mulifly  Is " + Mulfyallelements );

	}

}
