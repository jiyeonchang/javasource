package inheritance;

public class CreditLineAccountEx {
	
	
	public static void main(String[] args) {
		CreditLineAccount credit = new CreditLineAccount("122-22", 10000, "홍길동", 1000000);
		
//		System.out.println(credit.withdraw(1500000)); //한도 초과 
		System.out.println(credit.withdraw(1500)); 
		
				
	}

}
