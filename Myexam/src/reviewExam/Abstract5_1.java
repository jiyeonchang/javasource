package reviewExam;
//추상 클래스 선언 하는 법 (abstract)
/*클래스 선언에 abstract 를 붙여야 한다 
*new 연산자를 이용해서 객체를 만들지 못하고 상속을 통해 자식 클래스만 만들 수 있다 .
*직접 생성자 호출은 할수 없지만 자식 객체가 생성될때 super () 을 호츨해서 추상 클래스 객체를 생성한다 
*/
public abstract class  Abstract5_1 {
//필드 
	public String owner; 
	//생성자 
	public Abstract5_1(String owner2) {
		this.owner =owner; 
	}
	//메소드 
	public void turnOn () {
		System.out.println("폰전원을 켭니다");
	}
	public void turnOff() {
		System.out.println("폰 전원을 끕니다");
	}
	
}
