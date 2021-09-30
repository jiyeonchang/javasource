package ClassTest;

public class MyMath2 {
	//메소드 오버로딩 기법 적용 하기 
	//매서드 이름이 같아야 한다 
	//매개변수 , 타입이 달라야 한다 (괄호안이 달라야 한다) 
	int add(int a, int b) {
		System.out.println();
		return a+b;
	}
   long add (long a, long b ) {
	   return a+b; 
   }
   
   int add (int[]arr) {
	   int result=0;
		for (int i = 0; i < arr.length; i++) {
		result += arr[i];
	}
		return result ;
		
   }
   //생성자 오버로딩 클래스 이름과 동일해야한다 
   

   
}
