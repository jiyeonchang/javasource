package array;

import sun.security.util.Length;

public class ArrayTest7 {

	public static void main(String[] args) {

		int score [] = {78,65,95,88,36,45,25,47,87,43};
	int max =score[0];
	int min=score[0];
			
	
			
		//최고점수 구하기 
		//최저점수 구하기 
		
		
		
		for (int i = 0; i < score.length; i++) {
			if (max<score[i]) {//만약 스코어가 맥스보다 크면 맥스를 스코어 값으로 바꿔라 
				max=score[i];
			}else if (score[i]<min) {
				min= score[i];
			}
		}
System.out.printf("최고점수 : %d\n 최저점수: %d",max,min);

}
}
