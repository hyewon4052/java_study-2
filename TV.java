//클래스 선언부

public class TV {	
	// 클래스 멤버 : 생성자, 멤버변수, 메소드
	
	// 멤버변수와 메소드 만드는것이 모델링
	// 앞에 static이 붙으면 static이 붙음
	
	String color;
	Boolean power;
	int channel;
	
	// 기본 생성자 : 괄호안에 아무것도 없는 것
	public TV() {
		
	}
	
	//생성자, 역할: 멤버변수 초기화
	public TV(String color, Boolean power, int channel) {	
		this.color = color;	// this = TV
		this.power = power;
		this.channel = channel;
	}
	
	//메소드
	// void는 return 안함 다른문장은 return 없으면 에러
	void power() {		//toggle key
		power = !power;
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
}
