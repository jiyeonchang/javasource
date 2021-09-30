package ClassTest;

public class GoodsStockEX2 {

	public static void main(String[] args) {
		
		//첫번째 재고 관리 
		
		GoodsStock2 product1 = new GoodsStock2("p1234",30);
		
		//쿨래스 외부에서 속성을 직접 변경하는것은 안됨 
		//private 키워드가 걸려 있기 때문에 
//		product1.code= "p1234";
//		product1.stockNum =30;
		
	
//상품 판매 - >재고 감소 
	//호출 
// System.out.println ("현재 재고수량"+product1.subtrackStock(15););
	
	
	
//	product1.subtrackStock(15);
	
	int stockNum = product1.subtrackStock(15);
	//이후로 계속 사용할수 있다.
	System.out.println("현재 재고수량"+stockNum);
	
	
	
	product1.addStock(5);
	System.out.println("현재 재고수량"+	product1. getStockNum());
	
	
	}
}
