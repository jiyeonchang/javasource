package MyPractice;
//9.1오전강의 
import java.io.IOException;

//while,boolean

public class Practice4 {

	public static void main(String[] args)throws IOException {

		boolean run = true;
		int keycord = 0, speed = 0;

		while (run) {
			if (keycord != 13 && keycord != 10) {
				System.out.println("===========");
				System.out.println("1종속 | 2감속 |3중지");
				System.out.println("===========");
				System.out.println("선택 : ");

			}
			keycord = System.in.read();

			if (keycord == 49) {
				System.out.println("현재속도 = " + speed);
			} else if (keycord == 50) {
				speed--;
				System.out.println("현재속도 " + speed);
			} else if (keycord == 51) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}