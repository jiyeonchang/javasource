package inheritance;
//계좌번호 ,계좌주 ,잔액,입금하다 출금하다 =>부모가 가지고 있음 


import java.util.Scanner;

public class CheckingAccount extends Account2 {
	
	private String cardNo ;
  public CheckingAccount(String accountNo, int balance, String name,String cardNo) {
		super(accountNo, balance, name);
		this.cardNo=cardNo;
	}

	//카드번호 (111-11-1234	)
	
	
	/* 카드값을 지불한다.(넘어온 카드번호가 실제 발급된 카드번호가 같은지)
	 * 사용금액은 현재 잔액보다 작은지 확인후 
 * 입력값 : 카드번호 , 사용 금액
 * 반환값 : int(정수) 
 */
  
  int pay (String cardNo, int amount) {
	  if (!cardNo.equals(this.cardNo)||getBalance() < amount) {
		 System.out.println("카드번호와 사용금액을 확인해 주세요");
	 
	  return 0;}
	  
//	  setBalance(getBalance()-amount);
//	부모의 withdraw의 가능 과 같으니까 부모의 기능 호출하기 
	  
	 return  withdraw(amount);
			

	
	
  }
}


	
	
	
	
	
