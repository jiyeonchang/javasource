
public class school12 {

	public static void main(String[] args) {
		// 향상된for문 예제
		
	String arr[]= {"사과", "배", "수박","참외","딸기","포도","체리"};
	for(String str : arr) {//arr에서꺼내와서  string의 str에 담아라 
		System.out.println(str+" ");
	}
	
	System.out.println();//프로모션 -double이 int로 가게되는것
	double arr2 []= {56.2,23,44.2,11};//int와 double 이 섞여있어서 프로모션이 일어난다 
	for (double d :arr2) {
		System.out.println(d+" ");
	}
	
//	행과열을 가지고있는 소스는 무조건 괄호문 두개 행,열순임 
	
	
	
	}

}
