package myexam;

import java.util.Scanner;
//실행후 마지막 에러 원인 물어보기 
public class RestaurantKeybord {
	// 식당 이름 입력받기
	// 식당 크기 ,테이블 수
	// 영업중 모두 키보드로 내려받기
	public static void main(String[] args) {
  
		Scanner sc = new Scanner (System.in);

		System.out.println("가게이름 :");
		String name = sc.next();

		System.out.println("가게 사이즈 :");
		double size = sc.nextDouble();
		System.out.println("테이블수 :");
		int table= sc.nextInt();
		System.out.println("오픈여부 :");
		boolean open = sc.nextBoolean();
		
		System.out.println(name);
		System.out.println(size);
		System.out.println(table);
		System.out.println(open);
		
		
	}

}
