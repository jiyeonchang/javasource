package myexam;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		// position 입력 받은 후 출력 /position= "과장";
		// position 부장 700, 과장500, 나머지 300만원
//		(조건 )랜덤주사위로,switch문 사용하여 해결할것
		Scanner sc = new Scanner (System.in);
		String  position = sc.next();
		
		switch (position) {
		case "과장" : 
			System.out.println("월급 :700");
			
			break;
		case "부장" :
			System.out.println("월급 :500");
			
			break;
		default:
			System.out.println("월급 :300");
			break;
		}
		
		
		
	}

}
