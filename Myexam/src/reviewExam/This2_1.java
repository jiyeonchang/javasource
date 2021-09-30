package reviewExam;
/*인스턴스 (instans)와 This연습예제
 * -인스턴스 멤버란 객체 (인스턴스) 를 생성한 후 사용할 수 있는 필드와 메소드를 말한다.
 * -각각 인스턴스 필드와 인스턴스 메소드라고 부른다 .
 */
public class This2_1 {
//필드 
	String model; 
	int speed;
	
	//생성자 
	
	This2_1(String model ){
		this.model = model;
	}//모델선언 

	//메소드 
	
	void setSpeed (int speed) {
		this.speed= speed; 
	}//반환값 없음 
	
	
	 void run () {//스피드 선언 
		 for (int i = 10; i <=50; i+=10) //{10에서 시작해서 i가 50과 같거나작으면 false i를 10씩 올리면서 반복 
			 this.setSpeed(i);
			 System.out.println(this.model + " 가 달립니다 .(시속"+ this.speed+ "km/h)");
			
		}
	 }
	 
	 

