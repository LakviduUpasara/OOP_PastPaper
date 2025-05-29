package PaperVersionB2022.Q1;

public class Cat extends pet {

	@Override
	public   void feed(){
		points = points + 5 ;
		System.out.println(" cat is fed 5 points ");
	}

	@Override
	public void clean() {
		
		points = points + 10 ;
		System.out.println(" cat is fed 10 points ");
		
		
	}
	
	

	@Override
	public void cuddle() {
		points = points + 15 ;
		System.out.println(" cat is fed 15 points ");
		
	}

	@Override
	public void GetTotalpoints() {
		
		System.out.println(" cat is Total  points " + points );
		
		
	}

}
