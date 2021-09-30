package array;



public class ArrayTest03 {
	public static void main(String[] args) {
//int 타입의 배열 5개 생성 
//		0 10 20 30 40 
		int score[] = {0, 10, 20, 30, 40 };
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]+"\t");
	}
		// 향상된for문으로 
		for(int idx:score) {
			System.out.println(idx+"\t");//idx는 내맘대로 이름짓기 
		}
		
		
		
		//String 타입의 배열 5개 생성 
//	과일이름 초기화 

		
		String fruit []= {"사과","배","포도","바나나","딸기"	};
//		for (int i = 0; i < fruit.length; i++) {
//			System.out.print(fruit[i]+"\t");
			
			//향상된 for문 
		for(String f:fruit) {
			System.out.println(f+"\t");
			
			
		}
		
	}
}
