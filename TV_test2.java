
public class TV_test2 {
	public static void main(String[] args) {
		TV tv1 = new TV();
		TV tv2 = new TV();
		
		System.out.println("tv1의 channel 값은 " + tv1.channel + "입니다.");
		System.out.println("tv1의 channel 값은 " + tv2.channel + "입니다.");
		
		tv1.channel = 7;
		
		System.out.println("tv1의 channel 값은 " + tv1.channel + "입니다.");
		System.out.println("tv1의 channel 값은 " + tv2.channel + "입니다.");
	}
}
