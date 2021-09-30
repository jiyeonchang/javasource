package reviewExam;

public class abNoverriding6_2 extends abNoverriding6_1 {
 public abNoverriding6_2() {
	 this.kind = "포유류";
 }

@Override
public void sound() {//추상 메서드에서 sound 메서드 만들어서 강제로 만들게됨
	 System.out.println("멍 멍  ");
 }
}
