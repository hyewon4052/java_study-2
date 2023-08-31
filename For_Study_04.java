import java.util.Scanner;

public class For_Study_04 {

	public static void main(String[] args) {
		
		int arr[] = {10, 20, 30, 40, 50};
		//일반적인 for문
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}

		//향상된 for문 (배열만 가능)
//		for( int num : arr ) {
//			System.out.println(num);
//		}
		
		// (문제) i번 째 피보나치 수열구하기 1 1 2 3 5 8 13
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("숫자를 입력하세요 : ");
//		int num = sc.nextInt();
//		
//		int pibo[] = new int[num];
//		pibo[0] = 1;
//		pibo[1] = 1;
//		for (int i = 2; i < pibo.length; i++) {
//			pibo[i] += pibo[i-1] + pibo[i-2]; 
//		}
//		for (int i = 0; i < pibo.length; i++) {
//			System.out.print(pibo[i] + " ");
//		}
		
		//(문제) 1~100사이의 숫자중 3의 배수이면서 5의 배수인 수의 갯수와 총합을 출력하시오
		int sum = 0;
		int count = 0;
		for (int i = 1; i<=100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				sum += i;
				count++;
			}
		}
		System.out.println("갯수 : " + count + ", 총합 : " + sum);
	} //main

}
