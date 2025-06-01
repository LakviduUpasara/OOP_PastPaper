package Collection_frame_workAllQuetions;

import java.util.HashMap;

public class Question02B00258 {

	public static void main(String[] args) {

		InventoryManager manager = new InventoryManager() ;
		


		manager.addOrUpdateProduct("P001", "Laptop", 10, 1200.00);
        manager.addOrUpdateProduct("P002", "Mouse", 50, 25.00);
        manager.addOrUpdateProduct("P003", "Keyboard", 30, 45.50);
        manager.addOrUpdateProduct("P004", "Monitor", 20, 150.00);
        manager.addOrUpdateProduct("P005", "USB Cable", 100, 5.99);
		
        System.out.println();
        System.out.println("Upadate Product ");
        
        manager.addOrUpdateProduct("P001", "IRoss", 5, 7.5);
        manager.addOrUpdateProduct("P0022", "Test2", 5, 7.5);
		
        
        
        System.out.println();
        System.out.println("Print Current Inventry ");
		
        manager.ViewProduct();
        
        manager.removeProduct("P002");
        manager.removeProduct("P004");

        
        manager.removeProduct("P0022");
		
        System.out.println(" After Print Current Inventry ");
		
        manager.ViewProduct();
		

	}

}
