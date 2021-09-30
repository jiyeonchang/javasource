
public class school11 {

	public static void main(String[] args) {
		
		
		int arr[]={1,2,3,4,5,6,7,8,9,10};//배열선언,생성,초기화 동시에이렇게도 됨 
		

		for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
		
		System.out.println();
		
		for(int f:arr) {//향상된 포문 ,출력확인용 for문 
			System.out.println(f+" ");
		}

	}

}
