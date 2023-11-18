
public class TV_test1 {

	public static void main(String[] args) {
//		TV tv = new TV();
//		// 멤버변수 초기화 안하면 string = null, int = 0, boolean = false, double = 0.0
//		System.out.println(tv.color + " : " + tv.power + " : " + tv.channel);
//		
//		tv.power();	//power = true
//		System.out.println(tv.color + " : " + tv.power + " : " + tv.channel);
//		
//		tv.channel = 15;	//멤버변수 초기화
//		System.out.println(tv.color + " : " + tv.power + " : " + tv.channel);
//		
//		tv.color = "red";	//멤버변수 초기화
//		System.out.println(tv.color + " : " + tv.power + " : " + tv.channel);
//		
//		tv.channelDown();
//		tv.channelDown();
//		System.out.println(tv.color + " : " + tv.power + " : " + tv.channel);
		
		TV tv = new TV("red", true, 15);
		System.out.println(tv.color + " : " + tv.power + " : " + tv.channel);
		
	}

}
