import java.util.Iterator;
import java.util.Scanner;

public class school7 {

	public static void main(String[] args) {
//배열은 무조건 연속된공간에 저장 
	// 수정해서 넣을수없는게 원래있던 자리에 
//	공간이 얼마나 남아있는지 모르니까 새자리를 만들어서 원래것옮겨넣고 원래자리는 삭제한다. 
//	배열은 같은 타입을 담아야할때 쓴다.
		
		//배열 ->힙 (new)/new가 필요하다
		//배열 순서 : 배열선언 - 생성 -초기화 -사용
		//int타입으로 공간10개를 잡고 싶다면 
		int arr[];//선언
		arr= new int [10];//생성
		//int arr[]= new int [10];//선언 생성 동시에 
	
		//초기화 - 1~10값대입
for (int i = 0; i < arr.length; i++) {// arr.length하는이유가 생성에서 공간의 수를 바꿀수도 있기 때문에 
//	System.out.print(arr[i]+" ");
	arr[i]=i+1;


}	for (int i = 0; i < arr.length; i++) { //이거 for 문없어도 정상 출력
	System.out.print(arr[i]+" ");
}
	
	
	
	
	
	
	
	}
}

