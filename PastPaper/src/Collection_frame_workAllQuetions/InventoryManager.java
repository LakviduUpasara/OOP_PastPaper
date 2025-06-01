package Collection_frame_workAllQuetions;

import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
	
	private HashMap<String, Product> inventory = new HashMap<>();
	
	public void AddProduct(String code ,String Name ,int Quntity ,double price ) {
		
		if (inventory.containsKey(code ))
		{
			Product extisting = inventory.get(code) ;
			extisting.setName(Name);
			extisting.setQuentity(Quntity);
			extisting.setPrice(price);
			
			
			
			
		}
		else 
		{
			Product newProduct = new Product(Name ,Quntity ,price);
			inventory.put(Name, newProduct) ;
			System.out.println("prodect : " + code );
		
		}
		
		
		
		
	}
	
	public void removeProduct(String code ) {
		
		if (inventory.containsKey(code ))
		{
			Product extisting = inventory.get(code) ;
			
			inventory.remove(code) ;
			
			System.out.println(code  +"Reemoved Succusfully");
		}
		else 
		{
			System.out.println(code + "  not found ");
		
		}
		
	}

	
	public void ViewProduct() {
		
		if (inventory.isEmpty( ))
		{
			System.out.println("inventory is empty ");
			
		}else 
		{
			for (Map.Entry<String, Product>  entry : inventory.entrySet())
			{
				System.out.println("code " + entry.getKey() + "-" + entry.getValue());
			}
		}
		
		
	}
}
