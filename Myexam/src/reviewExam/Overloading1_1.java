package reviewExam;

//오버로딩 연습 예제 
/*오버 로딩 이란?
 * -하나의 메소드 이름을 여러 기능을 담는다.
 * -오버로딩의 조건은 매개변수의 타입, 개수, 순서중 하나가 달라야한다 
 */
public class Overloading1_1 {
	// 정사각형의 넓이

	double areaRectangle(double width) {
		return width * width;
	}

	// 직사각형의 넓이

	double areaRectangle(double width, double height) {
		return width * height;
	}

}
