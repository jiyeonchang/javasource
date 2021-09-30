package ClassTest;

public class Account {
//속성 : 계좌 번호(1656-6516-5456) ,잔액 ,이름 
	// 기능 : 입금 (입력값 : 입금액,반환값 없음  )현재잔액+=입금액
//	,출금 (입력값 :출금액 ,반환값: 현재잔액 )현재잔액-=입금액
	
	
	String accountNo;
	String name;
	int balance;
	
	void deposit (int amount ) {
		
		balance += amount ;
	}
	
	int withdraw (int amount) {
		if (balance < amount ) {
			balance-=amount;
		}
		return balance;
	}
	
}
