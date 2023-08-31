import java.util.Scanner;

public class Test_01 {

	public static void main(String[] args) {
		System.out.println("헬로우자바");
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력 : ");
		String name = sc.next();
		System.out.println("당신의 이름은 " + name + "입니다.");

	}

}
