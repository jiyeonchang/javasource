package collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {

	/*컬렉션 프레임워크 
	 * -여러 데이터들을 저장하는 클래스틀을 표준화한 설계 방식 
	 * Collection (인터페이스)- List ,set 
	 * -Map
	 * 
	 * 
	 *List (인터페이스): 순서가 있다 .데이터 중복 가능 
	 *  구현클래스 : Vector,ArrayList ,LinkedList,stack
	 *  배열과 같은 개념인데 향상시킨 구조 
	 *  단점 : 객체가 불연속하게 빠졌을때 하나 하나 직접 당겨서 정리해야함 
	 *  E,T,K,V:담을 객체 타입을 지정
	 *  
	 *  
	 *  기본타입을 =>객체 타입 (Wrapper클래스)로 변경해야 쓸수있다 
	 *  int => integer ,float => Float, double => Double ,char => Character, boolean => Boolean
	 */
	public static void main(String[] args) {
	
		
//		List<E> list1 = new ArrayList<E>();/*자바 유틸로 부르기*/
//		ArrayList<E>list2 = new ArrayList<E>();

		//위에거에서 밑에꺼처럼 변겅
		//객체 생성 (비어있는 상황)
		List<String> list1 = new ArrayList<String>();/*기본 변수 사용 못함 */
		ArrayList<Integer>list2 = new ArrayList<Integer>();
		
		//데이터 추가 ->add()사용
		list1.add("사과");//0번부터 5번까지 저장됨 
		list1.add("배");
		list1.add("바나나");
		list1.add("복숭아");
		list1.add("딸기");
		list1.add("망고");
		
		//데이터 가져오기 
		for(String str: list1)//향사된 for문 (타입 변수이름(막짓기) : 가져올 변수명)
		{System.out.println(str);
			
		}System.out.println();
		System.out.println(list1);//toString() 오버라이딩 되어 있음 
		System.out.println();
		
		for (int i = 0; i <list1.size(); i++) {//일반for문은 length말고 size()를 사용
			System.out.println(list1.get(i));
		}
		
		System.out.println();
		
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);
		list2.add(50);
		list2.add(60);
		
		for (Integer atr2 : list2) {
			System.out.println(atr2);
		}
		
		int sum=0;
        for (	Integer atr2 : list2) {
        	sum += atr2;
        	
		}System.out.println("합게"+sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
