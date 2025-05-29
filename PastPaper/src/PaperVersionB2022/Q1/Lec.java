package PaperVersionB2022.Q1;

public abstract class Lec implements Lecinter {
	
	protected String  name ;

	public Lec(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	
	public abstract void Desplaydetails();

}
