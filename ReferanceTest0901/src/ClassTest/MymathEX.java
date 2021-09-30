package ClassTest;

public class MymathEX {
 public static void main(String[] args) {
	//static 메소드 (클래스 메소드 )호출=> 객체 생성없이 호출 
	 
	 System.out.println(Mymath.add(100L, 300L));//long타입은 l을 붙여주기도 한다
	 System.out.println(Mymath.multiply(100L, 300L));
	 System.out.println(Mymath.subtract(100L, 300L));
	 System.out.println(Mymath.divide(100.0, 300.0));
	 
	 //멤버변수호출 
	
	 Mymath math = new Mymath();
	 
	 math.x=200L;
	 math.y=100L;
	 
	 System.out.println(math.add());
	 System.out.println(math.subtract());
	 System.out.println(math.multiply());
	 System.out.println(math.divide());
			 
	 
	 
}


	
}
