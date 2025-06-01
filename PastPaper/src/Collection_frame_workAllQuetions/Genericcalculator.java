package Collection_frame_workAllQuetions;

import java.util.Comparator;

public class Genericcalculator {

	
	public <T extends Number & Comparable<T>> T calculateMaximum(T[] array)
	{
		
		if (array == null || array.length ==  0)
		{
			return null;
		}
		
		T max = array[0];
        for (T element : array)
        {
            if (element.compareTo(max) > 0) {
            	
            	
            	max = element ;
            }
        	
        }
        
      
        
        return max;
		
		
		
		
	}
	
	public <T extends Number> double   calculateproduct (T[] array)
	{
		double   product  = 1.0 ;
		
		for (T item : array )
		{
			product = product *item.doubleValue() ;
		}
		
		
		return product ;
	}
	
}
