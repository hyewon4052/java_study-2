
public class ClassExample1 {

	public static void main(String[] args) {
		
		GoodStock obj = new GoodStock();
		obj.goodsCode = "A53125";
		obj.stockNum = 200;
		
		
		System.out.println("상품코드 : " + obj.goodsCode + ", 재고 수량 : " + obj.stockNum);
		
		obj.addStock(1000);
		System.out.println("상품코드 : " + obj.goodsCode + ", 재고 수량 : " + obj.stockNum);
		
		obj.subtractStock(700); 
		System.out.println("상품코드 : " + obj.goodsCode + ", 재고 수량 : " + obj.stockNum);
	}

}
