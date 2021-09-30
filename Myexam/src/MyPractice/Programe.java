package MyPractice;

public class Programe {
//	색상,전원상태 ,채널
	
	int color;
	boolean power;
	int channerl;
	
	void channelUp() {
		channerl++;
	}
	void channelDown() {
		channerl--;
	}
	void power() {
		power=!power;
	}
}
