package dynamic_beat2;

import java.awt.Image;

import javax.swing.JFrame;

public class DynamicBeat extends JFrame{
	
	private Image screenImage;
	private Image screenGraphic;
	private Image introBackground;

	public DynamicBeat() {
		setTitle("Dynamic Beat"); 		
		setSize(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		introBackground = new ImageIcon(Main.class.getResourve("../images/introBackground"))
		
	}

}
