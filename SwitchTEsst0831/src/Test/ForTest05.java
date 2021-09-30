package Test;

import java.util.Iterator;

public class ForTest05 {

	public static void main(String[] args) {
//		2단부터 9단까지 만들어보기 
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
 System.out.printf("%d*%d=%d\n",i , j, i*j );
			}
		}
		System.out.println();
		
		//구구단 방향을 옆으로하고 단이 끝나면 엔터넣기
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				
 System.out.printf("%d*%d=%2d\t",i , j, i*j );
 //자리를 예쁘게 잡고싶으면 %2d\t를넣으면 줄을 맞춰준다
			}
         System.out.println();//밑에 syso를넣어주면 엔터가 들어감 
		}
//		행과열을 만들고싶으면 무조건 for문 2개임
//3차원으로 만들고싶으면 (곂쳐서) for문 3개 들어감  
	
		//*로 세모모양 만들기 
//		for(int j=1;j<=1;j++) {
//			System.out.print("*");
//				}
//		System.out.println();
//		
//		for(int j=1;j<=2;j++) {
//		System.out.print("*");
//	}
//	System.out.println();
 
		for(int i=1;i<=1;i++) {
		for(int j=1;j<=5;j++) {
			System.out.printf("*");
		
		}
		System.out.println();
		}
		
		
		//모양 반대로 만들기 

		for(int i=1;i<=5;i++) {
		for(int j=5;j>=1;j--) {
			System.out.print(j<=i?"*":"");
//			if(j<=i) {
//			System.out.print("*");
//		}else {
//		System.out.print(" ");
//		}
	}
		System.out.println();
		}		
	}
}	
		
		
		
		
		
	