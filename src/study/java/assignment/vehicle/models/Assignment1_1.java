package study.java.assignment.vehicle.models;

import java.util.*;

public class Assignment1_1 {

	public static void main(String[] args) {

		String input;
		String height;
		String companyName;
		String vehicleType;
		String mileage;
		String name;
		String seatCount;
		Scanner sc;
		boolean b=true;
		List<Vehicle> vList = new ArrayList<>();
		sc = new Scanner(System.in);

		do {
			Vehicle v = null;
			System.out.println("Enter the Vehicle Name you want:\n 1.Cycle\n 2.Motorcycle\n 3.Car\n");

			input = sc.nextLine();
			switch (input) {
			case "1":
				System.out.println("Enter the Cycle Details you want:");
				height = sc.nextLine();
				companyName = sc.nextLine();
				vehicleType = sc.nextLine();
				Cycle c = new Cycle();
				c.setCompanyName(companyName);
				c.setHeight(height);
				c.setVehicleType(vehicleType);
				v = c;
				break;
			case "2":
				System.out.println("Enter the Motorcycle Details:");
				companyName = sc.nextLine();
				vehicleType = sc.nextLine();
				mileage = sc.nextLine();
				name = sc.nextLine();
				Motorcycle m = new Motorcycle();
				m.setCompanyName(companyName);
				m.setMileage(mileage);
				m.setName(name);
				m.setVehicleType(vehicleType);
				v = m;
				break;

			case "3":
				System.out.println("Enter the Car Details:");
				companyName = sc.nextLine();
				vehicleType = sc.nextLine();
				mileage = sc.nextLine();
				name = sc.nextLine();
				seatCount = sc.nextLine();
				Car cr = new Car();
				cr.setCompanyName(companyName);
				cr.setMileage(mileage);
				cr.setName(name);
				cr.setSeatCount(seatCount);
				cr.setVehicleType(vehicleType);
				v = cr;
				break;
			default:
				b=false;
				break;
			}

			v.viewInfo();
			vList.add(v);
		} while (b);
		
		System.out.println("All the vehicles are-\n");
		vList.forEach(vehicle->{
			vehicle.viewInfo();
		});
		
	}

}
