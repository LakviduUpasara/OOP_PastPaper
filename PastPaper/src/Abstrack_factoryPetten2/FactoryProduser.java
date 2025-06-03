package Abstrack_factoryPetten2;

public class FactoryProduser {
	
	public static AbstractFactory  getfactory(String Choise )
	{	 if (Choise.equalsIgnoreCase("Shape")) {
		
			return new Shapefactory();
		
	}
	else if (Choise.equalsIgnoreCase("Color"))
	{
		  return new colorFactory();
	}
	else 
		
		return null;
		
	}

}
