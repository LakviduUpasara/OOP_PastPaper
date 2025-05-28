package PaperVersionB2022.Q1;

public class Parrot extends pet {
	private  String command ;
	private boolean caught  = false ;
	

	public Parrot(String command) {
		super();
		this.command = command;
	}

	@Override
	public   void feed(){
		points = points + 5 ;
		System.out.println(" Parrot is fed 5 points ");
	}

	@Override
	public void clean() {
		
		points = points + 10 ;
		System.out.println(" Parrot is fed 10 points ");
	}

	@Override
	public void cuddle() {
		points = points + 15 ;
		System.out.println(" Parrot is fed 15 points ");
		
	}


	
	public boolean iscaugh() {
		
		try { 
			
			if (command.toLowerCase().startsWith("walk")) {
				
				throw new CaughtException("Parrot got cautgh ");
			}
			else 
			{
				System.out.println("Parrot eccaped safely ");
				
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
		points  = 0 ;
	}
		
		System.out.println(" Parrot is Total  points " + points );
		
		
	}
	

}
