package myexam;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		// 사용자한테 숫자2개 입력 받기
		// 연산자 입력 받기 (+,-,/,%)
		// switch연산자
		// 연산후 계산 출력
		
		Scanner sc = new Scanner(System.in);
				System.out.println("숫자입력");
		int a = sc.nextInt();
		System.out.println("숫자입력");
		int b = sc.nextInt();
		System.out.println("연산자 입력");
		String c = sc.next();
		
		
		int result=0;
		switch (c) {
		case "+" :
			result = a+b;
			
			break;
		case "-" :
			result = a-b;
			
			break;

		default:
			break;
		}
		System.out.printf("%d %s %d = %d",a,c,b,result);
	}

}
