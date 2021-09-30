package Test;

public class PrintTest01 {

	public static void main(String[] args) {

		int a = 3;
		int b = 4;
		System.out.print(true);// 괄호안에 무조건 뭘 넣어야함
		System.out.println("여기다가는 마음대로" + a);
		// 괄호안 공백허용 ->엔터한번넣으면 ㄱㅊ
//		+ : 문자열과 함께 사용하면 연결의 의미로 사용됨
//		System.out.printf();
		System.out.println(a + b);// 산술연산
		String str = "abc" + 3; //+ : 연결의 의미가 있음 
		System.out.println(str);
		
	}

}
