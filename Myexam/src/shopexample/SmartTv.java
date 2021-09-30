package shopexample;

public class SmartTv extends Product {
private String  resolvtion;
	
	
	public SmartTv(String pname, int price, String resolvtion) {
	super(pname, price);
	this.resolvtion = resolvtion;
}


	@Override
	public void printExtra() {
		 System.out.println("ÇØ»óµµ"+resolvtion);	
	}

}
