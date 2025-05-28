package PaperVersionB2023VertionF.Q1;

public abstract class Person {
	
	protected  int Id ;
	protected String name ;
	
	public Person() {
		
		Id = 0;
		this.name = null;
	}
	
	
	public Person(int id, String name) {
		
		Id = id;
		this.name = name;
	}

	public int getId() {
		return Id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		Id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void  DisplayDetails();
	
	
	
	
	
	

}
