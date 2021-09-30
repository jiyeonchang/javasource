package reviewExam;
// 정적 메소드 예시 문제 
// 이들 내부에 인스턴스 필드나 인스턴스 메소드를  사용할 수 없다.
// 자신의 참조인 this 도 사용 불가

/* 만약 정적 메소드와 정적 블록에서 인스턴스 멤버를 사용하고 
 * 싶다면 객체를 먼저 생성하고 참조 변수로 접근해야한다.
 */
//메소드가 어디서 에러나는지 알수있다 
public class Static4_1 {

	//인스턴스 필드와 메소드 
	int field1; 
	void method1 () {}
	
	//정적 필드와 메소드 
	static int field2 ; 
	static void method2() {}
		
	//정적 블록 
	static {
//		 field1 = 10;
//		 method();  -컴파일 에러남 
		 field2 = 10; 
		 method2();// static변수만 참조 가능 
	}
	
	//정적 메소드 
	static void Method3() {
		Static4_1 obj = new Static4_1();//객체를 먼저 생성하고 참조 변수 접근해야함 
//			this.field1 = 10; 
//			this.method1();-컴파일 에러 
		obj.field2 = 10; 
		obj.method2(); 
			
	//장실 타임 
	
	}
	
}

	

