package Test;

public class SwitchTest01 {

	public static void main(String[] args) {
//		주사위 만들기 
		
//		1-6사이의 수를 자동으로 생성 
		//0.0<=어떤값 <1.0
		int num = (int)(Math.random( )*6)+1;
//		가운데 (int)를 넣으면 정수로 바뀜
		
//		System.out.println(num); 
//		
//		if (num==1) {
//			System.out.println("1번나옴");
//		}else if (num==2) {
//			System.out.println("2번나옴");
//			
//		}else if (num==3) {
//			System.out.println("3번나옴");
//		}else if (num==4) {
//			System.out.println("4번나옴");
//		}else if (num==5) {
//			System.out.println("5번나옴");
//		}else if (num==5) {
//			System.out.println("6번나옴");

			
// switch (int, double,float,char,String,enum)
//case 값1:
//       해야할일
//       	break;
//case 값 2:
//       해야할일
//       	break;
//default:
//해야할일 :
			
//if - elseif - else 대체해서 사용가능 
		
		switch (num) {
		case 1: 
			System.out.println("1번나옴");
		case 2: 
			System.out.println("2번나옴");
		case 3: 
			System.out.println("3번나옴");
		case 4: 
			System.out.println("4번나옴");
		case 5: 
			System.out.println("5번나옴");
		 
			System.out.println("6번나옴");
				
			break;

		default:System.out.println("6번나옴");
		
			
		}
		
		
		
		
		
		
		
		
		}
	}


























