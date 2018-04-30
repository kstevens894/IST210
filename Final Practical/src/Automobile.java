
public class Automobile extends Vehicle implements VehicleDoor{
	public Automobile() {super("honk honk");}
	
	public Automobile(String hornSound){ super(hornSound); }
	
	public String getDoorType() {
		return VehicleDoor.DoorType.NORMAL.toString();
	}
	
	public int getDoorCount() {
		return 4;
	}
}
