
public class CardTest {

	public static void main(String[] args) {
		
		System.out.println("카드의 넓이 : " + Card.width);
		System.out.println("카드의 높이 : " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "스페이드";
		c1.number = 3;

		Card c2 = new Card();
		c2.kind = "다이아몬드";
		c2.number = 9;
		
		Card c3 = new Card();
		c3.kind = "하트";
		c3.number = 7;
		
		System.out.println("c1은 "+ c1.kind + "" + c1.number + "이며, 크기는 (" + Card.width+ ", " + Card.height + ")");
		System.out.println("c2은 "+ c2.kind + "" + c2.number + "이며, 크기는 (" + Card.width+ ", " + Card.height + ")");
		System.out.println("c3은 "+ c3.kind + "" + c3.number + "이며, 크기는 (" + Card.width+ ", " + Card.height + ")");
		
		Card.width = 80;
		Card.height = 120;

		System.out.println("c1은 "+ c1.kind + "" + c1.number + "이며, 크기는 (" + Card.width+ ", " + Card.height + ")");
		System.out.println("c2은 "+ c2.kind + "" + c2.number + "이며, 크기는 (" + Card.width+ ", " + Card.height + ")");
		System.out.println("c3은 "+ c3.kind + "" + c3.number + "이며, 크기는 (" + Card.width+ ", " + Card.height + ")");
		
	}

}
