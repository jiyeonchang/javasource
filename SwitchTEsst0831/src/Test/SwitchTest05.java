package Test;

import java.util.Scanner;

public class SwitchTest05 {

	public static void main(String[] args) {
// 사용자한테 숫자2개 입력 받기
//	연산자 입력 받기 (+,-,/,%)
		
//		switch연산자 
//		연산후 계산 출력 
	Scanner k = new Scanner(System.in);
	
	
	System.out.print("첫번째 수 입력 : ");
	
	int a = k.nextInt();
	
	
	System.out.println("두번째 수 입력 : ");
	
	int b = k.nextInt();
	
	System.out.println("연산자입력(+,-,/,%) : ");
	
	String op = k.next();
	
	
	int result =0;
	switch (op) {
	case "+" :
		result =a+b;
//		System.out.println(a+op+b+"="+(a+b));
//		문자가 들어있으면 + 는 앞뒤상관없이 연결의의미가됨
	case "-" :result =a-b;
//		System.out.println(a+op+b+"="+(a-b));
		break;
	case "/" :result =a/b;
//		System.out.println(a+op+b+"="+(a/b));
		break;
	case "%" :result =a%b;
//		System.out.println(a+op+b+"="+(a%b));
		break;
	case "*" :result =a*b;
//		System.out.println(a+op+b+"="+(a*b));
		break;
	default:
//		System.out.println("연산자를 확인해 주세요");
		break;
	}
	
	
System.out.printf("%d %s %d = %d",a,op,b,result);
		
		
		
		
		
	}

}
