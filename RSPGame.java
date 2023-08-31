import java.util.Scanner;

public class RSPGame {

	public static void main(String[] args) {
		int com, you;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			com = (int)( Math.random() * 3 ) + 1;	// com = 1,2,3
//			System.out.println(com);
			System.out.print("원하는 값을 입력(1 : 가위, 2 : 바위, 3: 보) : ");
			you = sc.nextInt();
			
			// 초급자 코스
//			if (com == 1) {
//				switch(you) {
//					case 1 : 
//						System.out.println("컴퓨터 : 가위, 사용자 : 가위	비겼습니다.");
//						break;
//					case 2 : 
//						System.out.println("컴퓨터 : 가위, 사용자 : 바위	사용자가 이겼습니다.");
//						break;
//					case 3 : 
//						System.out.println("컴퓨터 : 가위, 사용자 : 보	컴퓨터가 이겼습니다.");
//						break;
//					default : 
//						System.out.println("1에서 3사이의 숫자만 입력해주세요.");
//						break;
//				}
//				
//				
//			}
//			else if (com == 2 ) {
//				switch(you) {
//				case 1 : 
//					System.out.println("컴퓨터 : 바위, 사용자 : 가위	컴퓨터가 이겼습니다.");
//					break;
//				case 2 : 
//					System.out.println("컴퓨터 : 바위, 사용자 : 바위	비겼습니다.");
//					break;
//				case 3 : 
//					System.out.println("컴퓨터 : 바위, 사용자 : 사용자가 이겼습니다.");
//					break;
//				default : 
//					System.out.println("1에서 3사이의 숫자만 입력해주세요.");
//					break;
//			}
//			}
//			else {
//				switch(you) {
//				case 1 : 
//					System.out.println("컴퓨터 : 보, 주 : 가위	사용자가 이겼습니다.");
//					break;
//				case 2 : 
//					System.out.println("컴퓨터 : 보, 사용자 : 바위		컴퓨터가 이겼습니다.");
//					break;
//				case 3 : 
//					System.out.println("컴퓨터 : 보, 사용자 : 보	 비겼습니다.");
//					break;
//				default : 
//					System.out.println("1에서 3사이의 숫자만 입력해주세요.");
//					break;
//			}
//			}
			
			// 중급자 코스
//			switch (com) {
//				case 1 : 
//					System.out.print("컴퓨터 : 가위 \t");
//					break;
//				case 2 : 
//					System.out.print("컴퓨터 : 바위 \t");
//					break;
//				case 3 : 
//					System.out.print("컴퓨터 : 보 \t");
//					break;
//			}	//com
//			switch (you) {
//			case 1 : 
//				System.out.print("사용자 : 가위 \t");
//				break;
//			case 2 : 
//				System.out.print("사용자 : 바위 \t");
//				break;
//			case 3 : 
//				System.out.print("사용자 : 보 \t");
//				break;
//		}	//you
			
			System.out.print("컴퓨터 : " + print(com));
			System.out.println("사용자 : " + print(you));
			
			if ((you==1 && com ==3) || (you==1 && com ==1) || (you == 3 && com==2) ) {
				System.out.println("사용자가 이겼습니다.");
			}
			else if (you==com) {
				System.out.println("비겼습니다.");
			}
			else {
				System.out.println("사용자가 졌습니다.");
			}
			
			
			System.out.print("계속 하시겠습니까? (y or n)");
			String choice = sc.next();
			if (choice.equals("n") || choice.equals("N")) {
				System.out.println("게임을 종료합니다.");
				break;
			}
		} // while
		
		
	}// main
	
	static public String print(int su) {
		String choice = "";
		if (su == 1) choice = "가위 \t";
		else if (su == 2) choice = "바위 \t";
		else if (su == 3) choice = "보 \t" ;
		return choice;
	}
}	
