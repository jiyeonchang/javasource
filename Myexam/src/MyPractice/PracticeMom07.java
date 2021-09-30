package MyPractice;

import java.util.Scanner;

public class PracticeMom07 {

	public static void main(String[] args) {
//뭘 만들어 볼까여 음..
//		숫자찍기?흠..
//		컴퓨터가 원하는 숫자를 맞춰보는 프로그램 만들어보기 
		//엄마가 원하는 숫자 입력하게 함 
		Scanner sc = new Scanner(System.in);
		int b =(int)(Math.random()*11)+1;
		int a = sc.nextInt();
		int total=0;
	do {
		System.out.println("원하는 숫자를 10안에서 하나써주세요");
		total = sc.nextInt();
		
	if (total<b) {
		System.out.printf("땡 틀렸습니다. 컴퓨터 :%d 당신 :%d ",b,a);
		total = sc.nextInt();
		
	}else {
		System.out.printf("정답입니다. 컴퓨터 :%d 당신 :%d\n ",b,a);
		int a1 = sc.nextInt();
	}while (total!=b);
	
		System.out.printf("땡 틀렸습니다. 컴퓨터 :%d 당신 :%d ",b,a);
	
	

}
}





