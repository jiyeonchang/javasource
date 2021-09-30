package array;

public class ArrayTest01 {

	public static void main(String[] args) {

		//int타입의 변수 10 개 생성하고싶음 \
//		int a = 1;,b=2,..a..;//이름 전부짓기 힘듦 

		//		그래서 배열이라는 개념이 나옴 (참조타입)
//		같은 heap의 주소에 그룹같이 묶여서저장됨
//		자동으로 초기화됨 
//		정수는 :0 으로 초기화됨 .실수는 0.0 , boolean은 false 로 초기화됨 
		int arr[] =new int [10];//10이라고 적었으니 0~9번까지 저장됨
		
		// 그룹에 묶인 개별 요소에 접근하는 방법
//		방번호가 있다 0~부터 시작 
		System.out.println(arr[0]);
		arr[3]=90;//그냥하면 다 초기화된 값으로 나오니 값을 대입해준다 
	    //배열 출력하는법 
		System.out.println([1]);
		System.out.println([2]);//무식한 짓 
		System.out.println([3]);
		
		//한번에 출력 가능 방법은 for사용하라 
		for (int i = 0; i < 10; i++) {
			System.out.println(arr[i]);
		}
		
		
		
//	기본타입 
//		int sum;
//		System.out.println(sum);
// 		에러남 가운데 초기화 시켜줘야함 sum=0;		
	}

}
