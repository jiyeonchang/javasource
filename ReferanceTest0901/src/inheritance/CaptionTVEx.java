package inheritance;

public class CaptionTVEx {

	public static void main(String[] args) {
 CaptionTV ctv = new CaptionTV();
 ctv.channel = 10;
 ctv.channelUp();
	
	System.out.println("현재 채널 "+ ctv.channel);
	
	ctv.displaycaption("hello Werld");//안나오는 이유는 true를 안해줘서 false여서 안나옴 
	ctv.caption =true;
	ctv.displaycaption("hello java");
	
	}

}
