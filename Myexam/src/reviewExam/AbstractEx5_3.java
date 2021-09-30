package reviewExam;

public class AbstractEx5_3 {
public static void main(String[] args) {
	 // 추상클래스의 생성자를 호출해서 객체를 생성할 수 없는것을 볼 수 있음 
	//대신 자식 클래스의 객체를 생성해서 추상클래스의 메소드를 사용할 수 있음 
	//Abstract5_1 phone = new Abstract5_1();
	
	Abstract5_2 smartPhone = new Abstract5_2("toka");
	
	smartPhone.turnOn();
	smartPhone.turnOff();
}
}
