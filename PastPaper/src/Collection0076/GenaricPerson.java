package Collection0076;

import java.util.ArrayList;

public  class  GenaricPerson <T extends iPerson>  {

	
	  public void desplayElements (ArrayList<T> list) {
		  
		  for (T  elements : list )
		  {
			  
			  System.out.println(elements.displayDetails());
		  }
		  
		  
		
	}
	

	
	

}
