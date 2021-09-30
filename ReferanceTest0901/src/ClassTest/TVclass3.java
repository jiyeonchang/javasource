package ClassTest;

public class TVclass3 {

	public static void main(String[] args) {

		//tv 3번의 객체를 3개 생성하고 싶다 
		
		Tv3 tv1 = new Tv3();
		Tv3 tv2 = new Tv3();
		Tv3 tv3 = new Tv3();
		
		//배열 처리로 해보자 
		Tv3 tvArr[]= new Tv3[3];
		
		tvArr[0]= new Tv3("빨강",true,5);
		tvArr[1]= new Tv3("검정",false,6);
		tvArr[2]= new Tv3("흰색",true,2);
		printArr(tvArr);
		
		
	}
   static void printArr (Tv3 tvArr[]) {
	   //tvArr 객체내용을 출력하고싶음 
	   for (int i = 0; i < tvArr.length; i++) {
		System.out.println("TV색상"+tvArr[i].getColor());
		System.out.println("TV전원"+tvArr[i].isPower());
		System.out.println("TV채널"+tvArr[i].getChannel());
		System.out.println();
	}
	   
   }
	
	
	
}
