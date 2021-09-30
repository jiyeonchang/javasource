package MyPractice;

import java.util.Iterator;

public class Practice2 {
//이중 for문 
	public static void main(String[] args) {
  //행5줄 가로가 10번 반복되길 원할때
		
		for (int i = 0; i <5; i++) {//(세로 :열)하는 부분 
			for (int j = 0; j < 10; j++) {//(가로 :행)하는부분 
				System.out.print("*");
			}
		System.out.println();
		}
		
		//구구단 2단부터 9단까지 찍기 
		int sum = 0;
		for (int i = 2; i < 10; i++) {
		for (int j = 2; j < 10; j++) {
			System.out.printf("%d * %d = %d\n",i,j,i*j,sum);
		}
		    System.out.println();      //옆으로 방향을 바꾸고싶을때 \n넣고syso
		}
	System.out.println();
	
	
	//별로 삼각형 찍기 
	
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= i; j++) {
			System.out.print("*");//9.1오전강의 1:11
		}
		System.out.println();
	}
		//삼각형 반대로찍기 
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j>= 1; j--) {
				if (j<=i) {
					System.out.print("*");
				}else {
					System.out.print(" ");//print주의하기 
				}
			}
			System.out.println();
		}
		
		
	
}
}
