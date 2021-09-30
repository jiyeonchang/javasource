package Test;

public class WhileTest01 {

	public static void main(String[] args) {

		
		int i=10; 
		while (i<10) {
	// {}반복해야하는 작업넣기
			System.out.println("안녕하세요");
			i++;// i++;안넣으면 무한루프에 빠짐 
		}
	System.out.println();
	
	i=1; 
	while(i<11) {
	System.out.print(i+"\t");
	i++;
	}
	System.out.println();
	
	//3의배수
	i=3;
	while(i<101) {
	System.out.println(i+"");
	i+=3;
	}
}
}