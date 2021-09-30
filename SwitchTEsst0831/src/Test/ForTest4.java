package Test;


public class ForTest4 {

	public static void main(String[] args) {

// ********** 
// **********
// **********
// **********
// **********
		
//	1	이중 for 실행 순서 
//	2	int i=0;
//	3	i<3;
//	4	안쪽 for문의 int i=0;
//	5	i<3;
//	6	System.out.println("*"); /*하나 찍힘 
//	7	i++  -> i=1
//	8	i<3; /아직 조건만족하니까 다시반복 
//	9	System.out.println("*");/**
//		i++  -> i=2
//	10	i<3;
//	11	System.out.println("*");/**
//	12		i++  -> i=3
//	13	i<3; ->안쪽 for문 종료
//	14	System.out.println("*");
		
//		안쪽 for문
//		i++; i=2
//		i<3;
//		***
//		***
//		***
		
//		i++; i=3
//		i<3; ->바깥쪽 for문종료 
		
		
		
		
		for (int i = 0; i < 3; i++) {//행,열 이렇게 순서임 
			for(int j= 0; j < 3; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
