import java.util.Scanner;

public class school4 {

	public static void main(String[] args) {
	//정수를 입력하고 마지막에 0을 입력하세요
//		10 20 ~30 40
// 입력한 수의 개수는 4개이며 평균은 15.0입니다 
		Scanner sc = new Scanner(System.in);//입력받기 
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요");//설명
		int num ;//이부분을 반복해야 한다 
		int count =0;//개수 세는거 
		//사용자한테 int값을 받고 ,num이라는 변수에담고 num이 0이 아니여야한다 
		int sum=0;// 전체 합을 더한 수를 넣을 자리 
		
		while((num= sc.nextInt())!=0)
		{//0이 아닐때까지 받는다 
			//((num= sc.nextInt()!)안묶으면 수학식처럼-,+순서가 오류나기때문에 먼저 해달라고 묶는다
			 sum += num;//num은 키보드에서  받은 수가 다 들어있음 
		 count++;//하나식증가 하는거 셈
		}
		  
//	System.out.printf("입력한 수의 개수는 %d개이며 평균은 %.1f입니다",count,sum/count);
	//출력하면 에러남 f != java.lang.Integer으로 
//	이유는 정수를 실수%.1f로 출력하라 해서 -해결법은 캐스팅 (sum앞에 더블을 넣어준다)
//해결-System.out.printf("입력한 수의 개수는 %d개이며 평균은 %.1f입니다",count,(double)sum/count);
	
	
	

		System.out.print("입력한 수의 개수는"+count+ "개이며 평균은" +sum/count+"입니다");
	}
}

