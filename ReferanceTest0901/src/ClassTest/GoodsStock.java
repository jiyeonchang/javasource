package ClassTest;

public class GoodsStock {

	// 	속성 :상품 코드(p1234),재고 수량(100),
//		기능 : 	재고수량 증가(입력값 수량,출력값은 없음) ,
//				재고수량 감소(입력값 수량,출력값은 현재 재고 수량) 
	
	String code;
	int stockNum;
	
	void addStock (int amount) {
		stockNum +=amount;
		
	}
	int subtrackStock (int amount) {
//		stockNum -=amount;
		if (stockNum>amount) {
			stockNum-=amount;
		}
		    return stockNum;
	}
	

	
	
	
	
}
