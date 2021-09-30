package exam;

public class Account2 {
	
	
//	 ano ; //계좌번호 
//	 owner;//게좌주 
//	 balance ;//잔액
	
	//멤버 변수 선언 
	
	private String ano;
	private String owner;
	private int balance;
	
	public Account2 (String ano,String ower ,int balance)
	{super ();
	this.ano = ano;
	this.owner = owner;
	this.balance = balance;
		
	}
	
	public String getAno() {
		return ano;
	}
	
	public void setAno(String ano) {
		this.ano=ano;
	}
	
	public String getowner() {
		return owner ;
		
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	 public int getbalance () {
		 return balance;
	 }
	 
	 public void setBalance (int balance	) {
		 this.balance= balance;
	 }
	
	
	//클래스 생성 
	//private 으로 막혀있으니까 다른 클래스도 호출할수있게함 
	
	
	

}
