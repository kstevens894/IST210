
public class Driver {

	public static void main(String[] args) {
		
		Truck myTruck = new Truck();
		Car myCar = new Car();
		Motorcycle myMotorcycle = new Motorcycle();
		
		System.out.println("Truck:");
		myTruck.honkHorn();
		myTruck.drive();
		
		System.out.println("Car:");
		myCar.honkHorn();
		myCar.drive();
		
		System.out.println("MotorCycle:");
		myMotorcycle.honkHorn();
		myMotorcycle.drive();
		
		Vehicle[] myVics = { myTruck, myCar, myMotorcycle };
		VehicleDoor[] myDoors = { myCar, myTruck };
		
		for (int i = 0; i < myVics.length; i++) {
			System.out.print("This vehicle goes...");
			myVics[i].drive();
		}
		
		for (int i = 0; i < myDoors.length; i++) {
			System.out.print("Attempting to open the door... ");
			myDoors[i].openDoor();
			System.out.print("Attempting to close the door... ");
			myDoors[i].closeDoor();
		}
		
		
		

	}

}
