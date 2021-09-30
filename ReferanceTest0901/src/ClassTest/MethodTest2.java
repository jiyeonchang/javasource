package ClassTest;

public class MethodTest2 {
	
	
	
//두개의 숫자를 받아서 더한 결과를 보내주기 
//	정수형의 두개의 숫자 (정수인지 실수인지 확실하게 리턴타입 정하기 )
	
	
	int sum(int num1 ,int num2 ) {
//		return 0;-첫번째 방식 
//		
 int result = num1+ num2;
    return  result; 
//    한줄로 간단하게 하는법 result num1+num2;
    
	}
//	구구단 2~9단 출력하기 
//	결과 값안보낼거면 void
//	입력값 : 없음 , 반환값 : 없음 
	
	void print99dan() {
		for (int i = 2; i < 10; i++) {
			for (int j =1; j < 10; j++) {
				System.out.printf("%d *%d = %d\n",i,j,i*j);
				
			}
		}
	}
//	두개의 정수를 받아서 (입력값)곱하기한 결과를 리턴(반환값)하기 
	int multiply (int x,int y) {
		return x* y ; 
		
	}
	
	
	  
}
