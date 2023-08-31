
public class While_Study_03 {

	public static void main(String[] args) {
		// while문을 이용해서 -1 3 -5 7 -9 11 ``` 99까지 출력하고 그 합계도 출력하시오
		
		int i = 1; 
		int count = 1;
		int sum = 0;
		while (i < 100) {
//			System.out.println("i = " + i + ", count = " + count);
			if (count % 2 == 1) {
				System.out.print(-i + " ");
				sum += -i;
			}
				
			else {
				System.out.print(i + " ");
				sum += i;
			}
			i = i + 2;
			count ++;
		}
		System.out.println();
		System.out.println("총 합계 : " + sum);

	}

}
