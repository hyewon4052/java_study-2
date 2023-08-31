import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int com = (int)(Math.random() * 100) + 1;
		int count = 0;
		System.out.println(com);
		
		while (true) {
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			
			if (num > com) {
				count++;
				System.out.println("더 작은 숫자를 입력하시오.");
			}
			else if (num < com) {
				count++;
				System.out.println("더 큰 숫자를 입력하시오.");
			}
			else {
				System.out.println("정답입니다.");
				break;
			}
		}
		
		System.out.println();
		
		if (count <= 4) 
			System.out.println("Great");
		else if (count <= 8)
			System.out.println("Good");
		else 
			System.out.println("노력하세요.");
	}

}
