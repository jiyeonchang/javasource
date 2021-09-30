package myexam;

import java.util.Scanner;

public class AmusementPark {

	public static void main(String[] args) {
//		 모든 수는 입력 받는다 
		// 키가 150 넘으면 탑승가능
		// 나이가 10살 이하면 ok
		//나이가 5살 이상이고, 키가 2미터 이상이면 탑승가능
		//키가 2미터 이상이고, 나이가5살 이상이면 탑승가능 (!사용하기)
 
		Scanner sc = new Scanner(System.in);//System.in하고 탭안됨 물어보기 
		
		System.out.println("키를 입력해주세요:");
		int height = sc.nextInt();
		System.out.println("나이를 입력해 주세요:");
		int age = sc.nextInt();
		
		boolean a = age >= 5&& height >= 150;
		System.out.println(a);
		
		boolean b = !a;
		System.out.println(b); //a가false로나오면 true로 반대되서 나옴  

	}

}
