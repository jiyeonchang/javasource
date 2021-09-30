package All;

public class Overriding_2_Bus extends Overriding_1_Car {
	
 public void run() {
	 super.run();//부모가 가진 런 메소드를 실행할수 있다 
	 System.out.println("Bus의 run 메소드");
 }

}
