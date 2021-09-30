package inheritance;

public class SubListString extends ListString {
 String name ="성춘앙";
   @Override
	public void List() {
	   super.List();//부모의 리스트 호출
System.out.println(name + " 하위 클래스 ");	}


public void writer () {
	System.out.println(super.name);
}


}
