package exam;

import java.util.Scanner;

public class BankApplication2 {
   //클래스 선언 ,arr에 100개 만들기 
   private static Account2[] account2Array = new Account2[100];	
 private static Scanner scanner  = new Scanner (System.in);
	
	public static void main(String[] args) {
	
		boolean run = true ;
		while (run) {
			System.out.println("----------------------");
			System.out.println("1. 계좌 생성 | 2. 계좌목록 | 3.예금 | 4.출금 | 5.종료 ");
			System.out.println("----------------------");
			System.out.println("----------------------");
			System.out.print("선택 >");
			
			int selecNo =scanner.nextInt();
			
			int selectNo;
			
			if (selectNo ==1) {
				createAccount();//계좌 생성
			}else if (selecNo ==2 ) {
				accountLIst();//계좌목록
			}else if (selecNo ==3 ) {
				deposit();//계좌목록
			}else if (selecNo ==4 ) {
				withdraw();//출금
			}else if (selecNo ==5 ) {
				run = false;//종료
			}
			System.out.println("프로그램 종료");
			
			
		}
		
		
  }
	private static void createAccount() {
		System.out.println("--------------");
		System.out.println("계좌 생성");
		System.out.println("--------------");
		System.out.println("계좌번호 : ");
		String ano = scanner.next();
	 
		System.out.println("계좌주 : ");
		String owneer = scanner.next();
		
		System.out.println("초기 입금액 :");
		int balance = scanner.nextInt();
		
		Account2 newAccount2 =new Account2(ano, owneer, balance);
		for (int i = 0; i < account2Array.length; i++) {
			
			if(account2Array[i]==null) {
				account2Array[i]= newAccount2;
				System.out.println("계좌가 생성되었습니다");
				break;
			}
		}
	
	
	}	
	
	private static void accountList( ) {
		System.out.println("--------------");
		System.out.println("계좌 목록");
		System.out.println("--------------");
		for (int i = 0; i < account2Array.length; i++) {
			Account2 account2 = account2Array[i];
				if(account2 !=null) {
					System.out.print(account2.getAno());
					System.out.print(" ");
					System.out.print(account2.getowner());
					System.out.print(" ");
					System.out.print(account2.getbalance());
					
				}
			}
		}
		private static void deposit () {
			System.out.println("--------------");
			System.out.println("에금");
			System.out.println("--------------");
			System.out.print("계좌 번호 : ");
			String ano = scanner.next();
			System.out.print("예금액 : ");
			int money = scanner.nextInt	();
			Account2 account2 = findAccount(ano);
			if(account2 ==null) {
				System.out.println("게좌가 없습니다");
				return;
			}account2.setBalance(account2.getbalance()+money);
			System.out.println("결과 : 입금이 성공되었습니다 ");
			
			
		}
		
		
		private static void withdraw() {
			System.out.println("--------------");
			System.out.println("출금");
			System.out.println("--------------");
			System.out.print("계좌 번호 : ");
	       String ano = scanner.next();
	       
	       System.out.println("출금액");
	       int money = scanner.nextInt();
	       
	       Account2 account2 = findAccount(ano);
	       if(account2 == null) {
	    	   System.out.println("결과 : 계좌가 없습니다 ");
	       return;
	       }
	       account2.setBalance(account2.getbalance()-money );
	       System.out.println("결과 : 출금이 성공되었습니다 ");
	       
	       
		}
		
	
	private static Account2 findAccount(String ano) {
    Account2 account2 =null;
    for (int i = 0; i < account2Array.length; i++) {
		if(account2Array[i]!=null) {
			String abAno = account2Array[i].getAno();
			if(abAno.equals(ano)) {
				account2=  account2Array[i];
				break;
			}
		}
	}
		
		
		
		return account2;
	}
	}

