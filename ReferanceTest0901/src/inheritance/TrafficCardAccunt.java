package inheritance;


//계좌 번호 ,계좌주 , 잔액 ,교통카드, 교통카드 번호 기능 여부
// 입금하다 ,출금하다 ,체크카드 결제 ,교통카드 기능이 있다면 교통비 지불한다 
public class TrafficCardAccunt extends CheckingAccount {
//교통카드 기능 넣기 
	private boolean hastrafficCard;
	public TrafficCardAccunt(String accountNo, int balance, String name, String cardNo,boolean hastrafficCard) {
		super(accountNo, balance, name, cardNo);
		this.hastrafficCard = hastrafficCard;
	}

	//교통키드 결제 기능 있으면 결제 
		
	int paytrfficCard( String cardNo , int amount) {
		if (!hastrafficCard ) {
			System.out.println("카드를 확인해 주세요 ");
			return 0;
		}
		return paytrfficCard(cardNo, amount);
		
		
	}
	
	
	

	
	
	
}
