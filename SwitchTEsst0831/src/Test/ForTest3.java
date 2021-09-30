package Test;

import java.util.Scanner;

public class ForTest3 {

	public static void main(String[] args) {


			
		
		//사용자한테 구구단의 단수를 입력 받기 
		
		Scanner k = new Scanner (System.in);
		
		int a = k.nextInt();
		
		for (int i = 1; i <10; i++) {
			System.out.printf("%d*%d = %d\n",a,i,(a*i));
		}
		
		
		
	}

}
