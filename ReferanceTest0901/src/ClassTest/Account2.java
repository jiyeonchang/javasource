package ClassTest;

public class Account2 {
//속성 : 계좌 번호(1656-6516-5456) ,잔액 ,이름 
	// 기능 : 입금 (입력값 : 입금액 )현재잔액+=입금액
//	,출금 (입력값 :출금액 ,반환값: 현재잔액 )현재잔액-=입금액
	
	//외부로부터 값을 받아서 멤버 변수의 값을 변경하는 작업시 
	//set~으로 메소드를 시작한다.
	//멤버변수값변경 
	//멤버변수 : 계좌번호를 변경하고 싶다면 
	
	
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	//이름을 변경하고 싶다면 
	public void setName(String name) {
		this.name = name;
	}
	//잔액을 변경하고 싶다면 
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	private String accountNo;
	private int balance;
	private String name;
	
	
	
	//자동으로 생성자 만들기 
	//생성자 작성 마우스오른쪽 소스 클릭 -밑에서 세번째 =>일반생성자 
	//생성자 작성 마우스오른쪽 소스 클릭 -밑에서 두번째 =>default
	//기본 생성자 
	
	public Account2() {
		super();
	}
	
	public Account2(String accountNo, int balance, String name) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
		this.name = name;
	}

	public Account2(String accountNo, String name) {
		super();
		this.accountNo = accountNo;
		this.name = name;
	}
	//반환값이 없으면 void

	
	void deposit (int amount) {
		balance +=amount;
	}
	
//출금한다
	int withdraw(int amount) {
		if (balance> amount) {
			balance -=amount;
		}
		return balance;
	

	
	}
	
	
}
	
     

