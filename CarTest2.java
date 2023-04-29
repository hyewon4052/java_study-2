
public class CarTest2 {

	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println("c1의 color = " + c1.color + ", geartype = "+ c1.gearType + ", door = " + c1.door);
		
		Car c2 = new Car("Red");
		System.out.println("c2의 color = " + c2.color + ", geartype = "+ c2.gearType + ", door = " + c2.door);
		
		Car c3 = new Car("Yellow","Stick",2);
		System.out.println("c3의 color = " + c3.color + ", geartype = "+ c3.gearType + ", door = " + c3.door);
	}

}
