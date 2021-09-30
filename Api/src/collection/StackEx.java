package collection;

import java.util.Stack;

//Stack : LIFO (last in first Out)
// 수식계산,수식 괄호 검사 ,undo,redo,웹므라우저 뒤로/앞으로 할때 stack을 쓴다 

public class StackEx {

	public static void main(String[] args) {
Stack<String> stack = new Stack<String>();
//데이터 삽입
stack.push("사과");
stack.push("딸기");
stack.push("바나나");
stack.push("배");
	
	//데이터 가져오기 

System.out.println(stack);

System.out.println();

while(!stack.empty()	) {//stack에 빈자리가 아닌것을 pop(stack의 빼다단어)빼와라
	System.out.println(stack.pop());
	
}
	}
	

}
