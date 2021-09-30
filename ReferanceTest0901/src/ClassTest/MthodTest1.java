package ClassTest;

public class MthodTest1 {

	/*
	 *리턴다입 메소드명(....){
	 *
	 *리턴타입이 void인것을 제외 한다면 
	 *무조건 return키워드가 들어와야함 } 
	 * 
	 */
	
	
	//리턴값이 true/false메소드 생성=>boolean
	boolean isRedirect() {
		return false;//return 무조건 와야함 
	}
	
	//리턴값이 int타입인 메소드
	
	int sum () {
		return 3; 
	}
	
	//리턴값이 int ,두개의 전달인자 (int)를 받기 
	
	int multiply(int num1, int num2) {
		return num1* num2 ; 
	}
	
	//리턴값이 long ,두개의 전달인자 (int)를 받기 
	long add (long num1 , long num2) {
		return num1+ num2;
		
	}
	//리턴값: char 메소드 
	char method () {
		return 'c';
	}


void method1() {//넘기는 값 없음 
	
	
}


//리턴타입 : int 형 1차원 배열 
//전달인자 : int 형 1차원 배열 
int []print (int arr[] ){
	return arr; 
}
// 리턴 타입 : double ,매개변수 : 두개의 double 
// 해야할일 : 받은 두개의 매개변수를 나누기한 결과 리턴 
double divide (double a, double b 	) {
	return a/b ; 
}







}
