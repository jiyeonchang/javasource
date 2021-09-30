package MyPractice;

public class Tv {
	//속성(필드,멤버변수,프로퍼티) =>색상,전원상태 ,채널
	String color; //red ,blue, black 
	boolean power; //on ,off
	int channel;
	
	//동작(메소드) =>채널변경하다/전원을 켜다 /끄다 
	void channelUp () {
			//ChannelU가 해야하는 작업 작성 
		//현재 채널이 7번이=>8,9로 가야함 
		channel++;
		
		
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
	public void setColor(String color) {
		this.color = color;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public Tv(String color, boolean power, int channel) {
		super();
		this.color = color;
		this.power = power;
		this.channel = channel;
	}
	void ChannelDown() {
		channel--;
	}
	void power () {
		//power 가 해야하는 작업 on => off
		power = !power;
		
	}
}
