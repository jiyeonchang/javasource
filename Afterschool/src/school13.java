
public class school13 {

	public static void main(String[] args) {
//2중 arr
//	행과열을 가지고있는 소스는 무조건 괄호문 두개 행,열순임 
	
	int arr[][]=new int [3][2];//선언 생성했음 //괄호가 두개면 무조건 for문도 두개임
    //초기화안했을때값은 0이 들어있다.

//	행의 길이를 알고싶을때 System.out.println("행길이"+arr.length)
	//열의 길이를 알고싶을때 System.out.println("행길이"+arr[1].length)-열의 1번의 길이를 출력해라 
	System.out.println("행길이"+arr.length);//행의 0번의 2번을 알고싶으면 [0:행번호][2:열번호]
	System.out.println("행길이"+arr[1].length);
	for(int i= 0; i<arr.length;i++) {//행의 길이 
		for(int j= 0; j<arr[i].length;j++) {//열의길의 
		arr[i][i]=j+1;
	}
		for(int i=0; i<arr.length;i++) {//행의 길이 
			for(int j= 0; j<arr[i].length; j++) {//열의길의 
			System.out.printf("%2d",arr[i][i]);
		}
	}
	}
	}
}

