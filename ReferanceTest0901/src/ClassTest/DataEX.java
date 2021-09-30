package ClassTest;

public class DataEX {
public static void main(String[] args) {
	Data data = new Data();
	
	//x의 값 10으로 지정 
//	data.x=10; //data객체 안에 x멤버 변수가 가지는 값(10)을보냄 힙안에저장됨
//	change(data.x);
//	System.out.println("after change() x = "+data.x );
//	 System.out.println();
//	    
	    change(data);//change에있는 값을 호출함 호출해야지 쓸수있으니까
	    System.out.println("change() x = "+data.x );
}
static void change (int x) {
	x=10000;//그냥 x값만 바뀐거지 힙안에 값이 바뀌지는않음 
	System.out.println("change() x = "+x );
    System.out.println();
 

}
static void change(Data d) {
	System.out.println(d);
//(Data d)를부른다 선언해둔Data data = new Data();가 들어간다 
	// change에 힙에 있는 주소가 들어간다
	d.x=1000;
}
}
