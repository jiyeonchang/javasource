package All;

import java.util.Scanner;

public class Polymorphism_3_Ex {
public static void main(String[] args) {

	
	Scanner sc = new Scanner(System.in);
	System.out.println("바나나 : 1, 복숭아 : 2");
	int input = sc.nextInt()	;
	Polymorphism_1_fruit fruit; 
	if(input == 1) {
		fruit = new Polymorphism_Banana();
		fruit.show();
	}else if (input == 2) {
		fruit = new Polymorphism_2_Peach();
		fruit.show();
		
	}
	
	
	
}
}
