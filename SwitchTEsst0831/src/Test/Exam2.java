package Test;

public class Exam2 {

	public static void main(String[] args) {

//	주사위 2개 던지기 
//		나오는 주사위 눈 출력 (1,4)
		
//		주사위 눈의 합계가 5가 아니면 주사위를 다시실행 ,5되면 실행멈춤
		
	
	while(true) {
		int a = (int)(Math.random( )*6)+1;
		int b = (int)(Math.random( )*6)+1;
		System.out.printf("(%d,%d)\n",a,b);
	if(a+b==5) {
		break; 
	}
	
	
		
	}
	
	
	}

}
