package ClassTest;

public class Triangle3 {
//삼각형 넓이 구하기 
//	밑변 *높이 /2
	
	
	//속성 : 밑변 ,높이 
//	기능 (메소드 ) : 밑변 * 높이 /2 결과 리턴 
	
	//생성자는 기본 생성자 
//	Triangle2 (){}	//안해도 만들어줌
	
	
	
	
	
	private int baseLine ;
	private int height;
	//프라이빗 모드일때 생성자를 초기화 해서 EX에서 쓸수있게 한다 
	Triangle3 (int baseLine,int height){
		this.baseLine=baseLine;
		this.height=height;
	}
	
	
	
	
	
	
	
	
	public int getBaseLine() {
		return baseLine;
	}








	public void setBaseLine(int baseLine) {
		this.baseLine = baseLine;
	}








	public int getHeight() {
		return height;
	}








	public void setHeight(int height) {
		this.height = height;
	}








	//밑변 ,높이 
	int getArea ( ) {
		return(baseLine * height)/2;
		
	}
	
	
	
	
	
	
	
	
}
