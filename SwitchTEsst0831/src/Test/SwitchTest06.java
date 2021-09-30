package Test;

import java.util.Scanner;

public class SwitchTest06 {
public static void main(String[] args) {
	
//	가위(1)바위(2)보(3)
	
//	상대방은 컴퓨터로
//	랜덤 1-3번자동생성 
	
//	내가내는부분은 -입력 
//	츌력문 당신이 졌습니다 .이겼습니다 .비겼습니다
	Scanner k = new Scanner(System.in);
	
	int computer =(int)(Math.random() *3)+1 ;
	
	System.out.println("가위1,바위2,보3 중 하나 내시오.");
	
	int user = k.nextInt();
	
	System.out.printf("나:"+user, "컴퓨터 :" +computer);
	
	
	switch (user - computer) {
	case 1 :case -2:
		System.out.println("당신이 이겼습니다.");
		
		break;
	case 2 : case-1:
		System.out.println("비겼습니다");
		
	break;
	case 0 : 
		System.out.println("당신은 졌습니다.");
		
		break;

	default:
		break;
	}
//	반복문 for ,while ,do-while 
	
	
}
}
