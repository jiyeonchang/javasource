package Test;

public class SwitchTest02 {

	public static void main(String[] args) {
 char grade= 'B';
//  A or a ->우수회원 
//  B or b -> 일반회원 
// 아무것도 없음 ->손님 
 
 switch (grade) {
case 'A':
case 'a':
	System.out.println("우수 회원");
	break;
case 'B':
case 'b':
	System.out.println("일반 회원");
	break;
default:
	System.out.println("손님");
	break;//생략 가능 
	
}
 
 // if 문으로 변경 
 
 if (grade=='a'||grade=='A') {
	 System.out.println("우수 회원");
	
 }else if (grade=='b'||grade=='B') {
	 System.out.println("일반 회원");
}else if (grade=='e'||grade=='E') {
	 System.out.println("손님");
}

 
 
 
 
 
	}

}
