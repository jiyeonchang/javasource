package Test;

import java.util.Scanner;

public class DowhileTest3 {

	public static void main(String[] args) {
	 
// 컴퓨터가1~100사이의 정수를 임의로 선정 
//		사용자는 컴퓨터가 가지고 잇는 숫자가 무엇인지 알아맞추기 
		//임의로 숫자 선정해보기 math
		Scanner sc = new Scanner(System.in);
		int answer = (int)(Math.random()*100)+1;//0~99
		int input = 0; 
		do {
			System.out.println("예측한 숫자를 입력해 주세요");
			input = sc.nextInt();//50
			
			if (input<answer) {
				System.out.println("좀 더 큰수를 입력해 주세요");
				
			}else {
				System.out.println("좀더 작은수를 입력해 주세요");
			}
		}while(input!=answer);
		
				
	}

}
