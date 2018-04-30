
public class Automobile extends Vehicle implements VehicleDoor{
	public Automobile() {super("honk honk");}
	
	public Automobile(String hornSound){ super(hornSound); }
	
	public String getDoorType() {
		return DoorType.NORMAL;
	}
}
