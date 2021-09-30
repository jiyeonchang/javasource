package MyPractice;

//while 문 연습 

public class Practice3 {

	public static void main(String[] args) {
 int i=0;//i=0이기때문에 무한루프에 빠짐 ,i++을 반드시 넣어야함 
 while (i<10) {
	 System.out.println("hi");
 i++;
 
 }
 System.out.println();
  
 i =1;
 while (1<11) {
	 System.out.print(i+"\t");
 i++;
 } 		
  
}
}
