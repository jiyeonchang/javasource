package reviewExam;

public class OverloadingEx {

	public static void main(String[] args) {
  Overloading1_1 myCalcu = new Overloading1_1();
  
  //정사각형 넓이 구하기 
  double result = myCalcu.areaRectangle(10);
  
  //직사각형의 넓이 구하기 
  
  double result2 = myCalcu.areaRectangle(10, 20);
  
  System.out.println("정사각형넓이 ="+ result );
  System.out.println("직사각형넓이 ="+ result2 );
	}

}
