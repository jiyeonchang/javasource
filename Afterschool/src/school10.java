import java.util.Iterator;
import java.util.Scanner;

public class school10 {

	public static void main(String[] args) {

		// int 타입을 5개 저장하는 배열 생성 
		// 배열의 초기화를 위해 사용자로부터 입력받기

		// 입력받은 값 출력
		//평균 ,총합구해서 출력
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];// 배열명 생성함

		int sum = 0;
		int sum2 = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + "번째 점수입력 ");// 간단히 만듦
			arr[i] = sc.nextInt();// 이렇게 굳이 다안쓰고 입력받음
		}

		for (int i = 0; i < arr.length; i++) {// 구분하기위해서도 있지만 무조건 넣어야함
			System.out.print(arr[i] + " ");
			
			sum += arr[i];
			// sum += arr[i];총합,어느쪽 for문이든 상관없다 for문을 나가서 쓰게되면 값이 구해지지않은 상태가 되므로 에러가 난다 
		}

		sum2 = sum / 5;// 평균
		System.out.println("총합" + (sum) + "평균" + (sum2));
//System.out.printf로도 가능 대신 실수로 정수로 변경 해줘야함
	}

}