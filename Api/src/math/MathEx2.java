package math;
//·£´ı ¼ıÀÚ 3°³¾¿»Ì¾Æ¼­ ¼¼°³ ´Ù°°Àº ¼ıÀÚ¸é ¸ØÃã
public class MathEx2 {
public static void main(String[] args) {
//	Math.random();
	while(true) {
		int num1 =(int)(Math.random()*3)+1;
		int num2 =(int)(Math.random()*3)+1;
		int num3 =(int)(Math.random()*3)+1;
		System.out.printf("%d\t%d\t%d\n",num1,num2,num3);
	if(num1==num2&&num1==num3) {
		break;
	}
	
	
	}
}
}
