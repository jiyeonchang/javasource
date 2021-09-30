package inheritance;

public class Tv2 {
	//속성(필드,멤버변수,프로퍼티) =>색상,전원상태 ,채널
	private String color; //red ,blue, black 
	private boolean power; //on ,off
	private int channel;
	
//	public Tv2() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	public Tv2(String color, boolean power, int channel) {
		super();
		this.color = color;
		this.power = power;
		this.channel = channel;
	}
	public String getColor() {
		return color;
	}
	public boolean isPower() {
		return power;
	}
	public int getChannel() {
		return channel;
	}
	//동작(메소드) =>채널변경하다/전원을 켜다 /끄다 
	void channelUp () {
			//ChannelU가 해야하는 작업 작성 
		//현재 채널이 7번이=>8,9로 가야함 
		channel++;
		
		
	}
	void ChannelDown() {
		channel--;
	}
	void power () {
		//power 가 해야하는 작업 on => off
		power = !power;
		
	}
}
