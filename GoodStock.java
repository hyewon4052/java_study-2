
public class GoodStock {
	String goodsCode; 	//상품 코드
	int stockNum;		//재고 수량
	
	//생성자 오버로딩
	public GoodStock() {
		
	}
	
	public GoodStock(String goodsCode, int stockNum) {
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}
	// 입고
	void addStock(int amount) {	//void면 return문장 없어야함
		stockNum += amount;
	}
	//출고
	int subtractStock(int amount) {
		if(stockNum<amount) {
			return 0;
		}
		stockNum -= amount;
		return stockNum;
	}
}	
