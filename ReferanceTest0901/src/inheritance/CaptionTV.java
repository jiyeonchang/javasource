package inheritance;

public class CaptionTV extends Tv {

	
	boolean caption;
	void displaycaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}
