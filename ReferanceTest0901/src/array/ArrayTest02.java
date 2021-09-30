package array;

public class ArrayTest02 {

	public static void main(String[] args) {
//int 타입의 변수 10개 선언 
//		담을려고 하는 타입 배열명 []=new담으려고하는 타입 [개수];
	
		
		//배열의 선언과 생성(힙) 
		int scores [] = new int[10];
		
		int arr[];//선언
		arr = new int [10];//생성
		
		//배열의선언과 생성 및 초기화 (사용자한테 입력받지않으면초기화바로해도됨)
		int arr2[]= {35,95,73,33};
		
		for (int i = 0; i < arr2.length; i++) {
			//length는 배열길이다{35,95,73,33}4개니까 4임 
			System.out.println(arr2[i]+"");
		}
		
		
		
		
	}

}
