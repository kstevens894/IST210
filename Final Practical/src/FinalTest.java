
public class FinalTest {
	private static Vehicle[] arr;
	public static void main(String[] args) {
		int doorCount = 0;
		Vehicle V1 = new Vehicle();
		Automobile V2 = new Automobile();
		MotorCycle V3 = new MotorCycle();
		Airplane V4 = new Airplane();
		Racecar V5 = new Racecar();
		
		Vehicle[] arr = {V1, V2, V3, V4, V5};
		
		for(int i = 0; i <arr.length;i++)
		{
			System.out.printf("%s goes %s%n", arr[i].getClass(), arr[i].horn());
			
			if(arr[i] instanceof VehicleDoor) {
				VehicleDoor vehi = (VehicleDoor)arr[i];
				System.out.printf("%s has %d %s doors. %n", arr[i].getClass(), vehi.getDoorCount(), vehi.getDoorType());
				doorCount += vehi.getDoorCount();
			}
			else {
				System.out.printf("%s does not have any doors %n", arr[i].getClass());
			}
			
		}
		System.out.printf("These vehicles have %d total doors.", doorCount);

	}

}
