package study.java.assignment.vehicle.models;

public class Motorcycle extends Vehicle{
	private String name;
	private String mileage;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMileage() {
		return mileage;
	}

	public void setMileage(String mileage) {
		this.mileage = mileage;
	}
	
	public void viewInfo()
	{
		super.viewInfo();
		System.out.println("Motorcycle Name is "+name);
		System.out.println("Mileage of motorcycle is "+mileage);
	}

}
