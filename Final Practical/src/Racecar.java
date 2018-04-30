
public class Racecar extends Automobile{
	public Racecar() {super("meep meep");}
	
	public String getDoorType() {
		return VehicleDoor.DoorType.GULLWING.toString();
	}
	
	public int getDoorCount() {
		return 2;
	}
}
