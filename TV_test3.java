
public class TV_test3 {

	public static void main(String[] args) {
		TV tv1 = new TV();
		TV tv2 = new TV();
		
		System.out.println("tv1의 channel 값은 " + tv1.channel + "입니다.");
		System.out.println("tv1의 channel 값은 " + tv2.channel + "입니다.");
		
		tv2 = tv1;	//주소를 넘겨줌
		tv1.channel = 24;
		
		System.out.println("tv1의 channel 값은 " + tv1.channel + "입니다.");
		System.out.println("tv1의 channel 값은 " + tv2.channel + "입니다.");

	}

}
