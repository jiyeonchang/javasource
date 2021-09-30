package Test;

import java.util.Scanner;

public class SwitchTest03 {

	public static void main(String[] args) {

//	position 입력 받은 후 출력 /position= "과장";
		
		Scanner k = new Scanner(System.in);
System.out.println("직급입력 : ");
		String position = k.next();

//		position 부장 700, 과장500, 나머지 300만원

		switch (position) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;

		default:
			System.out.println("300만원");
			break;
		}
		
		
		
		
		

	}

}
