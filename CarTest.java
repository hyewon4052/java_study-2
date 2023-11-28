
public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		System.out.println("c1의 color = " + c1.color + ", geartype = "+ c1.gearType + ", door = " + c1.door);
		
		Car c2 = new Car("White", "auto", 4);
		System.out.println("c2의 color = " + c2.color + ", geartype = "+ c2.gearType + ", door = " + c2.door);
		
		
	}

}
