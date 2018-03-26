
public class Car extends Vehicle implements Sporty, VehicleDoor{
	@Override
	public void honkHorn() {
		System.out.println("Honk");
	}
	public void drive() {
		driveFaster();
	}
	@Override
	public void driveFaster() {
		System.out.println("vroom vroom");
	}

	@Override
	public void openDoor() {
		System.out.println("Door is Open.");
	}
	
	@Override
	public void closeDoor() {
		System.out.println("Door is closed");
	}
}
