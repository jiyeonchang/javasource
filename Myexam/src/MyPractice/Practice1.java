package MyPractice;

public class Practice1 {
//for,if문 연습 
	public static void main(String[] args) {
   //1~100 에서 3의 배수를 찍어보자 
		
	for (int i= 3; i < 100; i++) {
		if (i%3==0);{
	System.out.print(i+" ");
		}	
	}
	
	// 3의 배수만을 더하는 프로그램 만들기 ,9의 배수는 더하지 않음 
	
	int sum = 0; 
	for (int i = 3; i <101; i++) {
		if (i%3==0 && i%9!=0) { //i%9!=0- i를 9로 나눴을때 0이 안되는 수만 나와라
			sum +=i;
			System.out.println("3의배수이고 9의 배수는 아닌합"+sum);	
		}	
	}
	
	// 1~100까지 3의 배수이거나 5의 배수인 수의 합
	int sum2 = 0;
	for (int i = 0; i <101; i++) {
	if (i%3==0&&i%5==0) {
		sum2+=i;
	}	System.out.println("3의 배수이거나 5의 배수인 수의 합"+sum2);
	}
	
	
}
}
