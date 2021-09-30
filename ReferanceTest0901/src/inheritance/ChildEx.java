package inheritance;

public class ChildEx {

public static void main(String[] args) {
	//child 객체 생성 방법 2가지 
	//1)super (); => objest생성자 호출
	// 2)super (age ); => Parent 생성자 호출 
	//3)this.age = age 
	//4) child 객체 생성
	child child = new child(25);//25는 부모클래스의 int age를 넘겨받기 위해 숫자 씀 
	 System.out.println("child age : "+ child.getAge());
	child.play();
	child.print();
	
	 Parent parent =new child (26);
	 System.out.println("child age "+parent.getAge());
     parent.print();
}
}
