package shopexample;

public class User {
	
	private String name ;
    private PayType paytype;
	public User(String user,PayType paytype) {
		super();
		this.name = user;
		this.paytype = paytype;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public PayType getPaytype() {
		return paytype;
	}
	public void setPaytype(PayType paytype) {
		this.paytype = paytype;
	}
	

}
