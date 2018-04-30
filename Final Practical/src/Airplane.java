
public class Airplane extends Vehicle implements VehicleDoor{
	public String getDoorType() {
		return VehicleDoor.DoorType.GULLWING.toString();
	}
	public int getDoorCount() {
		return 2;
	}
}
