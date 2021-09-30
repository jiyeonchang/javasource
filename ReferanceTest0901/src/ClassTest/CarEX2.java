package ClassTest;

public class CarEX2 {

	public static void main(String[] args) {
//첫번째 차 
		//객체 생성시 생성자 자동 호출됨 
		Car2 car = new Car2();
		//기본 속성값은 String =>null
//		int =0,boolean=false ,bouble = 0.0
		
		//두번째차 
		Car2 car2 = new Car2("Kona");
		//3번째차 
		Car2 car3 = new Car2("Kona","black");
		//4번째차 
		Car2 car4 = new Car2("현대","Kona","black",250);
		
	}

}
