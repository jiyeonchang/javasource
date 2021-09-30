import java.util.Iterator;
import java.util.Scanner;

public class school9 {

	public static void main(String[] args) {

// int 타입을 5개 저장하는 배열 생성 
		//배열의 초기화를 위해 사용자로부터 입력받기 
		
	//입력받은 값 출력 
		
		Scanner sc = new Scanner(System.in);
		int arr [ ]= new int[5];//배열명 생성함 

		System.out.println("5명의 점수를 입력 하세요");
//		
//		System.out.println("1번의 점수를 입력 하세요");
//		arr[0]=sc.nextInt();
//		System.out.println("2의 점수를 입력 하세요");
//		arr[1]=sc.nextInt();
//		System.out.println("3의 점수를 입력 하세요");
//		arr[2]=sc.nextInt();// 번거롭다
		 
		
		for (int i = 0; i < arr.length; i++) {
			int num = sc.nextInt();
			 arr[i]= num;//입력받은 값넣기 
			
		}
		
		for (int i = 0; i < arr.length; i++)  {//구분하기위해서도 있지만 무조건 넣어야함
		System.out.println(arr[i]+"");
	
	}
}

}