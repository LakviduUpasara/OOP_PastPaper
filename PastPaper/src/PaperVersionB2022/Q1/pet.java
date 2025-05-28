package PaperVersionB2022.Q1;

public abstract class pet implements PointAllocator  {
	
	protected  int points ;
	
	@Override
	public int getPoints() {
		return points;
	}
	
	@Override
	public void setPoints(int points) {
		this.points = points;
	}


	public abstract  void feed();
	public abstract  void clean();
	public abstract  void cuddle();
	public abstract  void GetTotalpoints();
	

	
	
}
