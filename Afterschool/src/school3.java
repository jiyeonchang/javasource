
public class school3 {

	public static void main(String[] args) {
//		1+2+3+4+5+6+7+8+9+10=55
		int sum=0;
		int i=1;
			while(i<11){
				
				sum+=i;
				System.out.print(i);
				if(i<10) {
					System.out.print("+");
					
					}		
					else{
						System.out.printf("=%d",(sum));
		}
				i++;

		}
	}
}

