package array;

public class ArrayTest4 {
	public static void main(String[] args) {
//점수의 평균과 합계 구하기 
		
		int score [] = {78,65,95,88,36,45,25,47,87,43};//점수담는 배열
//--------------		
		//열명의 점수를 평균내고싶을때 평균= 합계/계수(score.length)
		int sum =0;//합계담는 변수
//	for (int i = 0; i < score.length; i++) {
//		sum = sum+score[i];
		
		//score[i]하나씩 가지고 나와서 더함
		//sum+=score[i]로 더 간략히 가능 
//	}
//--------------		
	
	// 향상된 for문으로 작성 하는법 
	for(int jumsu: score) {
		sum +=jumsu;
		
	}
	
	System.out.printf("합계 : %d ,평균 : %d",sum,sum/score.length);
	
	
	}
}
