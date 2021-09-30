package ClassTest;

public class GoodsStock2 {

	// 	속성 :상품 코드(p1234),재고 수량(100),
//		기능 : 	재고수량 증가(입력값 수량,출력값은 없음) ,
//				재고수량 감소(입력값 수량,출력값은 현재 재고 수량) 
	//속성 감추기 private
	private String code;
	private int stockNum;
	
	
	
	GoodsStock2(){//()안에 아무것도 없으면 기본생성자 디폴트 생성자 
		
	}
	GoodsStock2(String code,int stockNum){//생성자 오버로딩 ,괄호 안을 다르게 하자 
	this.code = code;//멤버변수 초기화 목적 
	this.stockNum= stockNum;
	}
	
	
	
	
	
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
	
//현재 재고수량을 리턴하는 기능을 가진 메소드 만들기
	int getStockNum() {
	return stockNum;
	
	}
	
	
}
