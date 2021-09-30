package Test;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {

		boolean run = true;

//잔액
		Scanner sc = new Scanner(System.in);

		int balance = 0;
		while (run) {
			System.out.println("************************");
			System.out.println("1. 예금 | 2.출금 | 3.잔고 |4.종료");
			System.out.println("************************");
			System.out.println("선택 >>");
// 1선택 사용자한테 예금액 입력 받기 - 입력받은금액 balance추가
			int menu = sc.nextInt();
			switch(menu) {
			case 1 :
				System.out.println("예금액 :");
				int money =sc.nextInt();
	balance = balance += money;//balance += money;/balance+=sc.nextInt();도 가능 
				break;
			case 2 :
				System.out.println("출금액 :");
	      balance-=sc.nextInt(); 
				break;
			case 3 :System.out.println("잔액 : " +balance);
				break;
			case 4 :
				run = false;
				break;
			default:
			System.out.println("메뉴확인");
			break;
				
				
			}
			}
			
			
//			내가한 연습예제 나중에 for 문으로 바꿔보기 
//			for (int i = 0; i < 10; i++) {
//			if (a==1) {
//				System.out.printf("%d,%d\n", (balance + a));
//			}else if (a==2) {
//		      for (int h = 0; h < 10; h++) {
//				int b = sc.nextInt();
//				System.out.printf("%d,%d\n",(balance - b) );
//				}else if (a==3) {
//			      for (int h = 0; h < 10; h++) {
//						int b = sc.nextInt();
//						System.out.printf("%d ",balance  );
//					}else if (a==4) {
//					      for (int h = 0; h < 10; h++) {
//								int b = sc.nextInt();
//								System.out.printf("%d ",balance  );
//							}
//					}
//				}
//							
					
			
//2선택 사용자한테 출금액 입력 받기 - 입력받은금액 balance차감 
//3선택 balance출력  
//4선택 run = false 변경후 프로그램 종료   

			
			

			}
		}
