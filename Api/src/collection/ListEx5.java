package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/*
 * ArrayList - 개수 지정없이 배열 가능함(중복 가능)
 *  순차적으로 추가나 삭제하는경우 ArrayList가 빠름=>size를 크게잡는게 중요
 * LinkdeList -
 *  중간 데이터를 추가 /삭제시 LinkedList 가 빠름 
 * 
 * 여기에서 걸린시간 확인해보자 
 */
public class ListEx5 {

	public static void main(String[] args) {
		List<String> arraylist = new ArrayList<String>(2000000);
		List<String> linkedList = new LinkedList<String>();
		
		System.out.println("*********순차적 추가 *********");
		System.out.println("arraulist걸린시간 "+add1(arraylist));
		System.out.println("linkedlist걸린시간	"+add1(linkedList));
	
		System.out.println();
		
		System.out.println("*********중간에서 추가 *********");
		System.out.println("arraulist걸린시간 "+add2(arraylist));
		System.out.println("linkedlist걸린시간	"+add2(linkedList));
		
		System.out.println();
		
		System.out.println("*********중간에서 삭제 *********");
		System.out.println("arraulist걸린시간 "+remove1(arraylist));
		System.out.println("linkedlist걸린시간	"+remove1(linkedList));
		
		System.out.println();
		
		
		System.out.println("*********순차적으로 삭제 *********");
		System.out.println("arraulist걸린시간 "+remove2(arraylist));
		System.out.println("linkedlist걸린시간	"+remove2(linkedList));
		
		
	}//순차적 추가 
	
 public static long add1(List<String> list) {//add1(arraylist);,add1(linkedList);두개 다 받아짐 
	long start =System.currentTimeMillis();
	 for (int i = 0; i < 1000000; i++) {
		list.add(i+"");
	}
	 long end = System.currentTimeMillis();
	 return end-start;
 }
 //중간에서 추가 
 public static long add2(List<String> list) {
	 long start =System.currentTimeMillis();
	 for (int i = 0; i < 10000; i++) {
		 list.add(500,"x");
	 }
	 long end = System.currentTimeMillis();
	 return end-start;
 }//중간에서 삭제
 
 public static  long remove1(List<String> list) {
	 long start =System.currentTimeMillis();
	 for (int i = 0; i < 10000
			 ; i++) {
		 list.remove(i);
 } long end = System.currentTimeMillis();
 return end-start;
 
}//순차적으로 삭제 
 public static  long remove2(List<String> list) {
	 long start =System.currentTimeMillis();
	 for (int i =list.size()-1; i >0; i--) {
		 list.remove(i);
	 } long end = System.currentTimeMillis();
	 return end-start;
 }
}
