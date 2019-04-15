package study.java.assignment.vehicle.models;

public class Cycle extends Vehicle
{
	private String height;

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}
	public void viewInfo()
	{
		super.viewInfo();
		System.out.println("Height of Cycle is "+height);
	}
	
}
