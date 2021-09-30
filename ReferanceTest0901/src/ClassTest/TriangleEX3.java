package ClassTest;

public class TriangleEX3 {
	
	
	public static void main(String[] args) {
		//길이가 서로 다를 삼각형 5개를 가지고 있다.
		//넓이 구하기 
		
		Triangle3 triArr[]= new Triangle3[5];
		
		triArr[0] = new Triangle3(10,15);
		triArr[1] = new Triangle3(3,12);
		triArr[2] = new Triangle3(32,33);
		triArr[3] = new Triangle3(51,45);
		triArr[4] = new Triangle3(11,3);
			
		Triangle2 triangle1 = new Triangle2(10,15);
		
  triArr(triArr);
		
}
	static void triArr (Triangle3 triArr[]) {
		for (int i = 0; i < triArr.length; i++) {
			
			System.out.println("면적 "+triArr[i].getArea());
		}
	}
	
}
