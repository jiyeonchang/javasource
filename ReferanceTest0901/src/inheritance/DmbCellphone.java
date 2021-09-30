package inheritance;

public class DmbCellphone extends CellPhone {
	int channel; 
	 
	void turnOnDmb() {
		System.out.println("채널"+channel+"번 dmb방송 시작 ");
		
	}void turnOffDmb(){
		System.out.println("채널"+channel+"번 dmb방송 종료 ");
	}
	void shangChannelDmb(int channel) {
		System.out.println("채널"+channel+"번 변경");
	}

}
