package inheritance;

public class PolyEx {

	public static void main(String[] args) {
  Parent2 p2 = new Child3();
  
  p2.field1 = "";
  p2.method1();
  p2.method2();
  
  //method3실행 하는법 
  
  Child3 c= (Child3)p2;
  c.method3();
  
  //에러의 예 
  Parent2 obj = new Parent2()	;//주소값이 부모클래스 밖에 안나오는데 자식클래스의 메소드를불러서 에러남
  Child3 c2 = (Child3) obj ;
  c2.method3(); //java.lang.ClassCastException 런타임 에러 
  
	}
 
}
