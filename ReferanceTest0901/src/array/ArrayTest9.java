package array;

import java.util.Iterator;

import sun.security.util.Length;

public class ArrayTest9 {

	public static void main(String[] args) {
//합계를 구하고 싶을 때 
		int score[][] = { { 100, 100, 100 },
							{ 20, 20, 20 }, 
							{ 30, 40, 30 }, 
							{ 40, 50, 20 },
							{ 50, 60, 50 } };// 6행 4열이다

//		int result [][]=new int[6][4];
		int result[][] = new int[score.length + 1][score[0].length + 1];
// 3개에서 1줄 더 만들거니까 +1해준다 

		// 오류종류 - System.out.println(score)[5][4];
		// java.lang.Error: Unresolved compilation problems:

		// 합계를 구해서 값을 추가
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				// score 값을 result로 옮기기
				result[i][j] = score[i][j];
//행합계 만들기 
				//result[0].length하면 4번까지 나온다 (이미 4번 만들어 놔서)그리서 -1해줌 
				result [i][result[i].length-1]+=result[i][j];
				
				//전체 합계 
				result [5][3]+= score[i][j];
				//숫자의 변화가 나올수도 있으니까 
//	이렇게도 가능	result[result.length-1][result[i].length-1]+=score[i][j];
			}

			//열합계
			result[result.length-1][0]+=result[i][0];
			result[result.length-1][1]+=result[i][1];
			result[result.length-1][2]+=result[i][2];
			
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.printf("%5d", result[i][j]);
			}
			System.out.println();
		}

	}
}
