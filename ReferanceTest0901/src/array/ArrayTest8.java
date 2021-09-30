package array;

import sun.security.util.Length;

public class ArrayTest8 {

	public static void main(String[] args) {

		
		//카드를 45만들자(1~45번)
		
		int card [] = new int [45]; 
		
		
		for (int i = 0; i < card.length; i++) {
			card[i]= i +1; 
			
		}
		for(int no : card) {
			System.out.print(no+" ");
		}
		//카드 섞기 (testMain01참고 )
		for (int i = 0; i < card.length; i++) {
			int pos = (int)(Math.random()*45);//바꿀위치 선정 ,i는 0~44번까지 이니까 45까지 씀 
			int temp = card[i];
			card [i] = card [pos];
			card[pos]=temp;
		}
		
		System.out.println();
		for(int no:card) {
			System.out.print(no+" ");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
