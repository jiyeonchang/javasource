package ClassTest;

import java.util.Set;

public class AccountEX2 {
//속성 : 계좌 번호(1656-6516-5456) ,잔액 ,이름 
	// 기능 : 입금 (입력값 : 입금액 )현재잔액+=입금액
//	,출금 (입력값 :출금액 ,반환값: 현재잔액 )현재잔액-=입금액
	public static void main(String[] args) {

		Account2 account1 = new Account2();
		account1.setAccountNo("p1566-656");
		account1.setBalance(1000);
		account1.setName("홍길동");
		account1.deposit(50000);
 System.out.println("현재잔액"+account1.getBalance());
		// 성춘향계좌

		Account2 account2 = new Account2("1566-56-6", 500, "성춘향");

		System.out.println("현재 잔액 조회 : " + account2.getBalance());

//박보검 계좌 
		Account2 account3 = new Account2("684-6156", 10000, "박보검");
		System.out.println("현재 잔액 조회 : " + account3.getBalance());

	}
}