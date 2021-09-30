package Test;

public class ForTest01 {

	public static void main(String[] args) {
		
// 1-10 까지 합/4:48
		int sum =0;//sum -main종료시 제거됨 
		for (int i = 0; i < 11; i++) {
			sum= sum+i;
			
		}System.out.println(sum);
		
		System.out.println();
		
//		1-100까지 합 
		
		sum= 0;//위에 sum을사용했기때문에 다시적어서 초기화를 시켜줌 
		
		for (int i = 1; i <100; i++) {
          sum = sum +i;			
		}System.out.println("1-100까지 합 "+ sum);
		
	}

}
