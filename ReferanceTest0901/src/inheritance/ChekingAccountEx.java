package inheritance;

public class ChekingAccountEx {

	public static void main(String[] args) {

		CheckingAccount checkingaccount = new CheckingAccount("121-12",200000,"홍길동","1222-12-133")	;
		
		
		
//	카드번호 안맞는 경우 
//		System.out.println(checkingaccount.pay("1212-12",200000));
		
// 카드번호 맞는 경우 
		System.out.println(checkingaccount.pay("1222-12-133",1000));
	
	
	}

}
