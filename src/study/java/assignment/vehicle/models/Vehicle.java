package study.java.assignment.vehicle.models;

public class Vehicle {
	
	private String companyName;
	private String vehicleType;
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public void viewInfo()
	{
		System.out.println("Company Name is "+companyName);
		System.out.println("Vehicle type is "+vehicleType);
	}
}
