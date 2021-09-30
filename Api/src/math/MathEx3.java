package math;

public class MathEx3 {
//하나의 클래스에 모든 메소드가 static메소드로 구성되어있다면 
	//import static으로 만들어서 사용 가능 
	public static void main(String[] args) {
		double val = 90.7552;
		System.out.println(" round()"+ Math.round(val));//반올림
		System.out.println("ceil()"+ Math.ceil(1.1));//올림
		System.out.println("floor()"+Math.floor(1.5));//버림
		System.out.println("max()"+Math.max(1.5, 1.2));
		System.out.println("min()"+Math.min(1.5, 1.2));
	}

}
