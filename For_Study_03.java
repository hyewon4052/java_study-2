import java.util.Scanner;

public class For_Study_03 {

	public static void main(String[] args) {
		// 두개의 주사위를 던졌을 때 합이 6이 되는 모든 경우의 수를 출력하고 그 횟수도 출력하세요.
		
//		int count = 0;
//		for (int i = 1; i <= 6; i++ ) {
//			for(int j = 1; j <= 6; j++) {
//				if (i + j == 6) {
//					System.out.println(i + "," + j);
//					count++;
//				}
//			}
//		}
//		System.out.println("합이 6이 되는 횟수 : " + count);
		
		
		
		// 문자형 숫자를 입력받아서, 그 자릿수의 합을 구하시오.
		// "12345" 15
		// "4444"  16
		// 23      5
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("숫자를 입력하시오 : ");
//		String su = sc.next();
//		
//		int sum = 0;
//		for (int i =0; i < su.length(); i++ ) {
//			sum += su.charAt(i)-48;		// char 1의 ASKII코드 값은 49 이므로 0의 아스키코드 값인 48을 빼준다.
//		}
//		System.out.println(sum);
		
		
		
		//정수를 입력받아 각 자릿수의 합을 구하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하시오 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println(sum);
		
		

	}

}
