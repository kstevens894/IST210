
public class Truck extends Vehicle implements VehicleDoor{
	@Override
	public void openDoor() {
		System.out.println("Door is heavy and hard to Open.");
	}
	
	@Override
	public void closeDoor() {
		System.out.println("Door is heavy and hard to close.");
	}
	
	public void drive() {
		{
			System.out.println("rumble rumble");
		}
	}
}
