package test;

public class TypeTest01 {

	public static void main(String[] args) {
//타입 -1) 기본타비 2)참조타입 
//		사용되는 타입에따라 변수의 메모리에사용되는 방식이 달라짐
		
		//기본 타입 
//		스택영역 stack 에저장 /자동 반환일어남 
		int age = 23; 
		double price = 200.3; 
		
		
		
		
		
		//참조 타입//참조타입만 null로 초기화 가능 
//		값이 숫자로 저장되는데 숫자는 heap영역에 주소 값이다-heap으로저장됨  
// 문자열 생성 : String name = new String("java");/정식선언법
		String name = "java";//==사용가능하긴함 ,약식코딩
		String name2 = new String("java");//정식코딩 
//		String hobby = "독서";
		String hobby = null;// null로 초기화 가능,아직 힘 영역이 할당되지 않은것
		
//	 값 비교하고싶을때 (==  != 이지만 
//	String 에서 값 비교하고싶을때 equals() 
		
		System.out.println(name == name2? "동일함 ":"다름");
		//값이 다르다고 나온다 .
//		같은 java라는 단어지만 저장될때는 다른heap의 영역주소로 저장되기 때문에 다르게 인식 
//		그래서 string은 equals 를 써야한다 
//		null : heap주소가 안나옴 ,나중에 실제 사용할때 넣음 
		
		System.out.println(name.equals(name2)? "동일함 ":"다름");//같다고나옴
		
	System.out.println(hobby);// null로 나옴 	
	System.out.println(hobby.length()); 
	//hobby밑 노란줄 java.lang.NullPointerException	
//	.length / .을붙이고 뒤에영어붙으면 heap에가서 정보 알아오란 이야기인데 아무것도 정보가 없으니 에러가 남 
	}

}
