package com.hyondai.project;

import com.samsung.porject.Account;

public class AccountEX {
//속성 : 계좌 번호(1656-6516-5456) ,잔액 ,이름 
	// 기능 : 입금 (입력값 : 입금액 )현재잔액+=입금액
//	,출금 (입력값 :출금액 ,반환값: 현재잔액 )현재잔액-=입금액
	public static void main(String[] args) {
		
	
	
Account account1 =new Account("1656-6516-5456",10000,"홍길동");
//account1.accountNo="1656-6516-5456";
//account1.balance=10000;
//account1.name="홍길동";

//void 그냥호출만 한다 
account1.deposit(50000);
//출금
System.out.println("현재 잔액 : "+account1.withdraw(30000));


	
}
}