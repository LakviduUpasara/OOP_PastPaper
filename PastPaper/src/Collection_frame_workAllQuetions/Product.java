package Collection_frame_workAllQuetions;

public class Product {
	
	
	private String Name ;
	private int Quentity ;
	private double  price ;
	
	
	
	public Product(String name, int quentity, double price) {
		super();
		Name = name;
		Quentity = quentity;
		this.price = price;
	}
	
	
	public Product() {
		
		Name = null;
		Quentity = 0;
		price = 0.0;
	}

	public String getName() {
		return Name;
		
	}
	public int getQuentity() {
		return Quentity;
		
	}
	public double getPrice() {
		return price;
		
	}
	public void setName(String name) {
		Name = name;
		
	}
	public void setQuentity(int quentity) {
		Quentity = quentity;
		
	}
	
	public void setPrice(double price) {
		
		this.price = price;
		
		
	}
	
	
	public String toString ()
	{
		
		return "Name " + name  + ", Quntity " + Quentity + ",price  : Rs " + price   ;
		
	}
	
	

}
      