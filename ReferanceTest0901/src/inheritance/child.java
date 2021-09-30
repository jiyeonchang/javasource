package inheritance;
//extends부모 클래스명
//생성자와 초기화 블럭은 상속되지 않음 
// private 멤버 변수는 접근이 제한됨 
//확장의 개념 
public class child extends Parent {

	public child(int age) {
		super(age);//parent의 int를 받는 생성자 호출 
	}
	
	
//	Implicit super constructor Parent() is undefined for default constructor. Must define an explicit constructor
	
	
//	public Child() {
//		super (); //parent 기본 생성자 호출 
//	}
	
	void play () {
		System.out.println("놀자 !!");
	}
	@Override
 public void print() {
	 System.out.println("Hello");
 }
}
