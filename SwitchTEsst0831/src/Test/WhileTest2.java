package Test;

public class WhileTest2 {

	public static void main(String[] args) {

//		1-100까지 합 
		
//		sum= 0;//위에 sum을사용했기때문에 다시적어서 초기화를 시켜줌 
//		
//		for (int i = 1; i <100; i++) {
//          sum = sum +i;			
//		}System.out.println("1-100까지 합 "+ sum);
 int sum = 0, i=1; 
		 while(i<101) {
		sum=sum+i;
		i++;
		 }
		 System.out.printf("1~100까지의 합",sum);

//			구구단 2단 만들어 보기 
//			for (int i = 0; i < 10; i++) {
//				System.out.println("2*" + i+ "="+(2*i));
	// printf로 변환 했을때	- System.out.printf("2* %d = %d\n ", i,(2*i));
		
		  i=2;//값초기화 
		 while(i<10) {
			 System.out.printf("2* %d = %d\n ", i,(2*i) );
			 ++i;
		 }
		 
}
}