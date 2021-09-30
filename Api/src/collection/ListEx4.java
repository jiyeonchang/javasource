package collection;

import java.util.LinkedList;
import java.util.List;
/*
 * ArrayList - 개수 지정없이 배열 가능함(중복 가능)
 *  순차적으로 추가나 삭제하는경우 ArrayList가 빠름
 * LinkdeList -
 *  중간 데이터를 추가 /삭제시 LinkedList 가 빠름 
 * 
 */
public class ListEx4 {

	public static void main(String[] args) {
 List<String> list = new LinkedList<String>();
 
 list.add("사과"); 
	list.add("배");
	list.add("바나나");
	list.add("복숭아");
	list.add("딸기");
	list.add("망고");
	
	System.out.println(list);
	
	
	}

}
