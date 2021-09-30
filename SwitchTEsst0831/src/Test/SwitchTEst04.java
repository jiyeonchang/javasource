package Test;

public class SwitchTEst04 {

	public static void main(String[] args) {
		// 8 :출근을 합니다.
//		9: 회의를 합니다
//		10: 업무를 봅니다
//		나머지 : 외근을 나갑니다 

//		8-11사이의 숫자가 나오도록 작성 
//		Math.random( )*6 -> 0-5 나옴
//		int num = (int)(Math.random( )*6)+1; / 5까지밖에 안나와서 1더함 
//		int num = (int)(Math.random( )*4)= 0-3까지 나옴
		int time = (int) (Math.random() * 3) + 8;
		switch (time) {
		case 8:
			System.out.println("출근을 합니다");
			break;
		case 9:
			System.out.println("회의를 합니다");
			break;
		case 10:
			System.out.println("업무를 봅니다");
			break;
		default:
			System.out.println("외근을 나갑니다");
			break;
		}
	}

}
