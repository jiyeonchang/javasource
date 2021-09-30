package inheritance;

public class CaptionTV2 extends Tv2 {

	
	public CaptionTV2(String color, boolean power, int channel) {
		super(color, power, channel);
		// TODO Auto-generated constructor stub
	}
	boolean caption;
	void displaycaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}
