package ClassTest;




public class AccountEX3 {

	public static void main(String[] args) {
		Account3 accArr[]= new Account3[5];
		
		
		accArr[0] = new Account3("231",1000,"홍길동");
		accArr[1] = new Account3("312",15564,"한배동");
		accArr[2] = new Account3("45",561,"이춘덕");
		accArr[3] = new Account3("3634",564,"김두발");
		accArr[4] = new Account3("6364",516,"인상동");
		
//		
//		for (int i = 0; i< accArr.length; i++) {
//		
//			System.out.print(accArr[i].getName()+"\t");
//			System.out.print(accArr[i].getAccountNo()+"\t");
//			System.out.println(accArr[i].getBalance()+"\t");
//		}
		accountPrint(accArr);
			
		
System.out.println();

		for (int i = 0; i< accArr.length; i++) {
			Account3 account = accArr[i];
//			
//			//입금 (	Account3 account = accArr[i];)이게 잘 되는지 /heap의 주소가 같은건지 
			account.deposit(10000);
			accountPrint(account);
//			System.out.print(account.getName()+"\t");
//			System.out.print(account.getAccountNo()+"\t");
//			System.out.println(account.getBalance()+"\t");
	}
		
		
		
	}
	//메소드 오버로딩이다 ()안을 다르게 써야한다 
	
	static void accountPrint(Account3 accArr[]){
		for (int i = 0; i< accArr.length; i++) {
			
			System.out.print(accArr[i].getName()+"\t");
			System.out.print(accArr[i].getAccountNo()+"\t");
			System.out.println(accArr[i].getBalance()+"\t");
		}
	}
	
	static void accountPrint(Account3 account){
		System.out.print(account.getName()+"\t");
		System.out.print(account.getAccountNo()+"\t");
		System.out.println(account.getBalance()+"\t");
		}
	}
	
	
	
	

