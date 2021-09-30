package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//찾는 변수 자리 조회 Arrays
public class ArraysEx4 {
public static void main(String[] args) {

//List의 크기를 변경할 수 없음 
	List<String>list =Arrays.asList("apple","사과","lemon");
//	List.add("수박");//에러남 
	System.out.println(list);
	
//	List<String> list1 = new ArrayList<String>();
//	list.add("apple");
//	list.add("사과");
//	list.add("lemon");//위쪽이 더 간단하게 만들수있다 
	
	List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
	list2.add(6);
	System.out.println(list2);
	


}
}

