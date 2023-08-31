
public class For_Study_01 {

	public static void main(String[] args) {
		
//		int i; int sum = 0;
//		for (i = 1 ; i <= 10; i++) {
//			System.out.println(i);
//			sum += i;
//		}
//		System.out.println();
//		System.out.println("i값 : " + i);
//		System.out.println("누적 값 : " + sum);
		
//		for (int i = 65 ; i <= 90; i++) {
//			System.out.print((char)i + " ");
//		}
//		System.out.println();
//		for (int i = 'A'; i <= 'Z'; i++)
//			System.out.print(i + " ");
		
//		for (int m = 1; m <= 3; m++) {
//			System.out.println(" m = " + m);
//			for (int n = 1; n <= 4; n++) {
//				System.out.print(" n = " + n);
//			} ///for n
//			System.out.println();
//		} // for m
		
//		for(char i = 65; i <= 90; i++) {
//			System.out.print(i + " : ");
//			for (char j = i; j <='Z'; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		//continue, break 연습
//		for(int i = 1; i <=10; i++ ) {
//			if (i == 7)
//				continue;
//			System.out.println(i);
//		}
		
		int kk = 0;
		for (; ; ) {
			kk++;
			System.out.println(kk);
			if(kk==10) break;
		}
		
	}

}
