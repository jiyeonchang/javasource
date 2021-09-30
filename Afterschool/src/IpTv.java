
public class IpTv extends ColorTV {

	private String ip;
	public IpTv(int size, int color,String ip) {
		super(size, color);
		
		
			this.ip = ip; 
		// TODO Auto-generated constructor stub
	}
	public void printproperty() {
		System.out.printf("나의 ipTv 는 %s ,주소는 %d 인치 %d",ip,getSize(),getColor());
	}
	
}
