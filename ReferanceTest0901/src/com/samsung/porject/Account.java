package com.samsung.porject;

public class Account {
//속성 : 계좌 번호(1656-6516-5456) ,잔액 ,이름 
	// 기능 : 입금 (입력값 : 입금액,반환값 없음  )현재잔액+=입금액
//	,출금 (입력값 :출금액 ,반환값: 현재잔액 )현재잔액-=입금액
	
	
	private String accountNo;
	private String name;
	private int balance;
	
	
	
	public Account(String accountNo,  int balance, String name) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}

	public void deposit (int amount ) {
		
		balance += amount ;
	}
	
	public int withdraw (int amount) {
		if (balance < amount ) {
			balance-=amount;
		}
		return balance;
	}
	
}
