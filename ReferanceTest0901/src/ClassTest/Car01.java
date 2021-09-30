package ClassTest;

public class Car01 {
	// 속성 :제조회사 ,모델명,색상 최대속도
	String company;
	String model;
	String color;
	int maxSpeed;

	//Car(){}=>기본생성자 (default)
	//클래스 내에 선언된 생성자가 하나도없으면 
	//컴파일러가 자동으로 기본 생성자를 만들어줌

//	동작- 메소드 
	//리턴타입 메소드명 (){}
	//리턴타입 메소드명 (타입 변수명 ,....){}
	// 동작 : 전진하다 ,후진하다
	void forward() {
		System.out.println("전진하다");
	}

	void backword() {
		System.out.println("후진하다");
	}
}
