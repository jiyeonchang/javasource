package eaxm;

import java.util.Scanner;

public class Degrees {

	public static void main(String[] args) {
//	화씨온도 =>섭씨온도 
		
//		조건
		
//		화씨온도 입력받기(정수)
//		받은 화씨온도 를 섭씨온도로 변환후 출력하기 
//		(화씨온도 -32)*5/9
		Scanner K = new Scanner(System.in);
	System.out.println("화씨온도 입력 :");
		int fireA = K.nextInt();
		
		double cels=(fireA-32)*5/9.0;
		
		System.out.println("섭씨온도 : " +cels);
		System.out.printf("섭씨온도 : %.4f",cels);
		
		
		
	
	}

}
