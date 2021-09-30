import java.util.Scanner;

public class school15 {

	public static void main(String[] args) {
// arr,2차원 배열  연습문제 
		
		
		//3명의 학생이 있고 3과목에대한 점수를 입력받고자 한다.
		//2차원 배열
		
		//출력
		
		//각학생의 과목 총합과 평균 출력 
	
		Scanner sc = new Scanner(System.in);
		
	
		int sum =0;//합계만들기위해 
		int student[][]=new int[3][3];
		
		for (int i = 0; i < student.length; i++) {
			System.out.printf("%d번",i+1);
			for (int j = 0; j < student.length; j++) {
				student[i][j]=sc.nextInt();			
			}			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("----------학생별 점수 현황-------------");
		System.out.println("번호\t 자바\t html\t string\t  종합\t 평균\t");
		System.out.println("-----------------------------------");
		
		
		for (int i = 0; i < student.length; i++) {
			System.out.printf("%d번",i+1);
			for (int j = 0; j < student.length; j++) {
				
				System.out.print(student[i][j]+"\t");
				
			sum+=student[i][j];
			}
			System.out.printf("%d %.1f\n",sum,(double)sum/student[i].length);
			
		}
			
		}
	
}
		
		
		
		
		
	

