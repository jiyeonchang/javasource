package eaxm;
/*변수의 유효범위 
 * 1- 선언된블록 내에서만 사용가능
 * 2- 로컬(지역변수)변수는 반드시 초기화 해야함 (메소드 안에 선언된 변수가 로컬변수임)
 */
public class VariableTest01 {

	private int num1;//변수
	
	public static void main(String[] args)//메소드
	{
		
		int num2 =0;//초기화한거임
		
		if (num2<10) {
		System.out.println(num2);
		int num3=3;//초기화한 변수 선언 
		}
		
		
	}
public void print () {
 System.out.println(num1);
}
}
