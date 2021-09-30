package inheritance;

public class CaptionTVEx2 {

	public static void main(String[] args) {
 CaptionTV2 ctv = new CaptionTV2("black",true,8);
// ctv.channel = 10;
 ctv.channelUp();
	System.out.println();
	//System.out.println("현재 채널 "+ ctv.channel);
	
	ctv.displaycaption("hello Werld");
	ctv.caption =true;
	ctv.displaycaption("hello java");
	
	}

}
