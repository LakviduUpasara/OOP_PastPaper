package PaperVersionB2022.Q1;

public class Squirrel extends pet {

	private  String command ;
	private boolean caught  ; 
	

	public Squirrel(String cmd) {
		
		this.command = cmd ;
		
	}

	@Override
	public   void feed(){
		points = points + 5 ;
		System.out.println(" Squirrel is fed 5 points ");
	}

	@Override
	public void clean() {
		
		points = points + 10 ;
		System.out.println(" Squirrel is fed 10 points ");
	}

	@Override
	public void cuddle() {
		points = points + 15 ;
		System.out.println(" Squirrel is fed 15 points ");
		
	}


	
	public boolean iscaugh() {
		
		try { 
			
			if (command.toLowerCase().startsWith("run")&& command.endsWith("5") ) {
				
				throw new CaughtException("Squirrel got cautgh ");
			}
			else 
			{
				System.out.println("Squirrel eccaped safely ");
				
			}
			
		} catch (CaughtException e )
		
		{
			 System.out.println(e.getMessage());
			 
			 caught  = true ;
			 
			  return  true ;
		}
		
		
		return caught ;
		
		
	}
	
	@Override
	public void GetTotalpoints() {
		
	if (iscaugh())
	{
		points  =0 ;
	}
		
		System.out.println(" Squirrel is Total  points " + points );
		
		
	}
	
	

}
