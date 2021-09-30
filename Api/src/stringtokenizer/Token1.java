package stringtokenizer;

import java.util.StringTokenizer;

public class Token1 {

	public static void main(String[] args) {
 String text = "홍길동/성춘행/박연수/이수홍";
	
 String [] names = text.split("/");
 for(String s:names) {
	 System.out.println(s);
 }
 
 StringTokenizer st = new StringTokenizer(text,"/");
 while (st.hasMoreTokens()) {
	 System.out.println(st.nextToken());
 }//토큰을 가지고 잇으면 다음거 가져와라 
 
	}

}
