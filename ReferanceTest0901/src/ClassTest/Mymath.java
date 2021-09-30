package ClassTest;

public class Mymath {
 //멤버 변수 ,long타입 변수 2개 
	
	//메소드 :add,subtract,multiply,divide
	//입력값 없음, 반환 값은 연산 결과
	
	 long x,y;
	
	 long add () {
		return x+y;
	}
	long subtract () {
		return x-y;
	}
	long multiply() {
		return x*y;
	}
	 double divide () {
		return x/y;
	}
	 
	 static long add (long x, long y) {//static에 입력값을 저렇게 넣어줘야 x,y를 쓸수있다 
		 return x+y;
	 }
	 static long subtract (long x, long y) {
		 return x-y;
	 }
	 static long multiply(long x, long y) {
		 return x*y;
	 }
	 static double  divide (double x, double  y) {
		 return x/y;
	 }

	
	
	
	
	
}
