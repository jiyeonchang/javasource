package Test;

import java.util.Iterator;

public class LoopTest01 {
//		for실행순서
//1-	int 1= 0;
//2-	i<10;	
//3- 	반복해야할 작업실행 ->	System.out.println("안녕하세요");
//4- 	i++ (i=i+1) ->i=1
//5- 	i<10;
//6- 	반복해야할 작업실행 ->System.out.println("안녕하세요");
//7- 	i++ (i=i+1) ->i=2
//8-	 1<10;
//9-	반복해야할 작업실행 ->System.out.println("안녕하세요");
//10-	반복 ....
//		i<10; 조건 불만족 -> for 루프를 빠져나감 ->for 종료 
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {// 반복해야할 작업
			System.out.println("안녕하세요");
					}
//  1-10까지 짝수만출력
//		int i =1;
//		i<11;
//		System.out.println(i);
//		i++
//		i<11;
//		System.out.println(i);
		for(int i=1; i<11; i++) {
			System.out.println(i);
		}
//		0-10,짝수만 출력 
		for (int i=0; i<11; i+=2) // i=i+2; -> i+=2
			System.out.print(i+"\t");  // tab넣을거면 print로만 입력
	
//	3의배수만 100까지 
	for(int i=3; i<100; i+=3) {
		//if(1%3==0)   / Systemout.print (i+"");이렇게if문을 넣을수도잇음
	System.out.println(i);
	
	
	}
	//1부터 100까지 정수중에서 3의 배수만을 더하는 프로그램 작성 
//	단 9의 배수는 더하지 않습니다 
	int sum =0;
	for (int i = 0; i < 101; i++) {
		if(i%3==0&& i%9!=0);
		{sum= sum=i; //sum+=i도같음
	}
	}System.out.println("3의 배수이고 9의 배수는 아닌 합 :"+sum);
	
	System.out.println();
	
//	1에서 100까지 정수중에서 3의 배수거나 5의 배수인 수의 합 
	
 int sum1 = 0;
 for (int i = 0; i < 101; i++) {
	if (i%3==0||i%5==0)
	{
      sum1+=i;
    		 }
 }
	
 System.out.println("3의 배수거나 5의 배수인 수의 합"+sum1);
	}

}