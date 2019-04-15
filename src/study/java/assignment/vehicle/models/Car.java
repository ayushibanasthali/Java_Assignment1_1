package study.java.assignment.vehicle.models;

public class Car extends Vehicle{

	private String name;
	private String mileage;
	private String seatCount;
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
	public String getSeatCount() {
		return seatCount;
	}
	public void setSeatCount(String seatCount) {
		this.seatCount = seatCount;
	}
	@Override
	public void viewInfo() {
		// TODO Auto-generated method stub
		super.viewInfo();
		System.out.println("Car Name is "+name);
		System.out.println("Mileage of car is "+mileage);
		System.out.println("Seat Count in car is "+seatCount);

	}
	
	
	
}
