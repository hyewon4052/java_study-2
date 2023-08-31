import java.util.Scanner;

public class While_Study_02 {

	public static void main(String[] args) {
		// (문제) while문을 이용해서 1부터 값을 누적하여 누적합계가 100을 넘기는 수와 그 합을 출력하시오.
		
//		int i = 0; int sum = 0;
//		while (sum <= 100) {
//			sum += ++i;
//		}
//		System.out.println("누적합계가 100을 넘기는 수 : " + i);
//		System.out.println("합 : " + sum);
		
		// (문제) 사용자로부터 정수를 하나 입력받아서, 그 수의 모든 약수를 출력하시오.
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수 입력 : ");
//		int su = sc.nextInt();
//		
//		int i = 1;
//		while (i <= su) {
//			if (su % i == 0)
//				System.out.println(i);
//			i++;
//		}
		
		//while문을 이용
		//(문제) 0에서 100사이의 임의의 정수를 여러개 입력받아서, 입력받은 정수의 갯수, 합계, 평균을 출력
		// 단 0보다 작은 값이 입력되면 프로그램은 종료되고, 
		// 100보다 큰 값이 입력되면 갯수, 합계, 평균에서 제되할 것
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int sum = 0;
		while (true) {
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			
//			if (num >= 0 && num <= 100) {
//				count++;
//				sum += num;
//			}
			if (num < 0) 
				break;
			else if (num > 100) continue;
			else {
				count++;
				sum += num;
			}
			
		}
			
			System.out.println("정수의 개수 : " + count);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + sum / (double)count);
		
	}

}
