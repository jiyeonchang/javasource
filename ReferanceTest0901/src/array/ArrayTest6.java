package array;

import sun.security.util.Length;

public class ArrayTest6 {

	public static void main(String[] args) {
//이차원 배열 
		
		int scores [][]= new int [2][3];//2행 3열
		
		//초기화
		scores[0][0]=15;
		scores[0][1]=25;
		scores[0][2]=35;

		scores[1][0]=45;
		scores[1][1]=55;
		scores[1][2]=65;
		
		//배열길이 확인 
		
		System.out.println("배열길이(행) : "+scores.length);
		System.out.println("배열길이(열) : "+scores[0].length);
		
		//전체적으로 돌아가면서 찍어보고싶을때 for문
//length를 사용하면 행,열을 알수있다
	for (int i = 0; i < scores.length; i++) {//바깥쪽for문은 행제어
		for (int j = 0; j < scores[i].length; j++) {
			System.out.println(scores[i][j]+"");
		}
		
		System.out.println();
	}
	System.out.println();
	
//	--------------
	
	for (int score [] : scores) {
		for (int j : score)
System.out.print(j + "");		
	}
	System.out.println();
	
	//열의 개수가 다를때 구하는 법 
	
	int arr[][]= {
			{15,25},
			{65,85,95}
	};
	for (int i [] :arr) {//1차원배월은 변수 이름만쓰고 이차원은 중괄호를 넣어줘서 2차원 배열을 가지고온다 
		for (int j : i)
System.out.print(j + "");		
	}
	System.out.print(scores);//[[I@19e0bfd
	System.out.print(arr);//힙주소값이 나옴[[I@139a55
	
	
	}

}
