import java.util.Iterator;
import java.util.Scanner;

public class school6 {

	public static void main(String[] args) {
// a~z까지 출력 
		
		char ch='a';
		while(ch<='z') {
			
			System.out.print(ch+" ");
		
		ch++;}
		
		System.out.println();
		
		
		
		//----------do while 
		char ch2='a';
		do {
			System.out.print(ch2+" ");
			ch2++;
		}while (ch2<='z');
		
	}
}

