package collection;

import java.util.ArrayList;
import java.util.Comparator;

public class ListEx2 {

	public static void main(String[] args) {
ArrayList<String> list = new ArrayList<>();

list.add("java");
list.add("adf");
list.add("gffgg");
list.add("ssss");
list.add("jjjj");
list.add("java");

System.out.println(list);
 
list.add(2, "oracle");//2번자리에 오라클 넣고싶을 때 

System.out.println(list);

//삭제하기
list.remove(1);//adf제거 
System.out.println(list);

//정렬 

list.sort(Comparator.reverseOrder());
System.out.println(list);//내림차순 reverseOrder()/오름차순 nateuralOrder()





	}

}
