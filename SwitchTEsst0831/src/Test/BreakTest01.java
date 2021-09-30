package Test;

public class BreakTest01 {
// break; 반목문 실행 중지 
	public static void main(String[] args) {
		while (true) {
			//주사위를 돌려서 6이나오면 반복문을 종료시키고 싶을때
			int num =(int)(Math.random()*6)+1;
			System.out.println(num);
			
			if (num ==6) {
				break; 
			}
		}
		
		
		
		
	}

}
