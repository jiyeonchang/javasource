package Test;

public class CountinueTest01 {
//continue; 반복문안에서 사용되며 블록 내에서 continue문이 실행되면 
//	for문의 증감식 , while의 조건식으로 이동
	public static void main(String[] args) {
    for (int i=1;i<=10;i++) {
    	
    	if (i%2!=0) {//홀수면은 계속하고 아니면 찍어내라
                   continue; //컨티튜가 실행되면 syso는 실행안되고 i++로 넘어간다    	
    	}
		
		System.out.println(i);
		
	}

	}
}
