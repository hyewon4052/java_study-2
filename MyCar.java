
public class MyCar {		//클래스 선언
	// 클래스 멤버 : 생성자, 멤버변수, 메소드
	
	private int speed;
	int wheel;
	public String irum;
	public final static int Handle = 5;
	
	//생성자 오버로딩
	public MyCar() {
		
	}
	
	public MyCar(int speed) {
		this.speed = speed;
	}

	public MyCar(int speed, int wheel) {
		this(speed);		//다른 생성자 호출
		//this.speed = speed;
		this.wheel = wheel;
	}

	public MyCar(String irum, int wheel) {
		this.irum = irum;
		this.wheel = wheel;
	}

	public MyCar(int wheel, String irum) {
		this.wheel = wheel;
		this.irum = irum;
	}

	public MyCar(int speed, int wheel, String irum) {
		this(speed);
		//this.speed = speed;
		this.wheel = wheel;
		this.irum = irum;
	}

	//정보은닉
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//메소드
	public void display() {		//전역변수 호출
		System.out.println("이름 : " + irum + ", 속도 : " + speed + ", 바퀴수 : " + wheel);
	}
	
	// 메소드 오버로딩
	public void display(String irum , int speed, int wheel) {	//지역변수 호출
		System.out.println("이름 : " + irum + ", 속도 : " + speed + ", 바퀴수 : " + wheel);
	}
	
	public static void test() {
		System.out.println("static 메소드 수정");
		System.out.println("핸들수는 : " + MyCar.Handle);
	}
}
