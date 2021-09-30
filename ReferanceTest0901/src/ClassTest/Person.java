package ClassTest;

public class Person {
	//final : 수정불가 /초기화무조건 필요 
	//final 이 사용되는곳 :클래스 ,매서드 ,멤버 변수 ,지역 변수 
	//클래스 에 붙으면: 상속 불가
	//메소드에 붙으면 : 오버라이딩 불가 
	//멤버변수,지역변수 에 붙으면 수정불가 
	final String nation ="korea";
	final String ssn;//The blank final field ssn may not have been initialized 초기화 시켜 줘야함 
	String name ; 
//	생성자 :멤버변수 초기화 
	public Person(String ssn, String name) {
		super();
		this.ssn = ssn;
		this.name = name;//ssn 초기화 방법 
	}
	
	
}
