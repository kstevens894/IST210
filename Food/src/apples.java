
public class apples {
	public static void main(String[] args) {
		
		Food bucky[]=new Food[2];
		bucky[0]=new potpie();
		bucky[1]=new tuna();
		
		for(int x=0; x < 2; ++x) {
			bucky[x].eat();
		}
		
		
	}
}
