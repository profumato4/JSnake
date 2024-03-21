package main;

import java.awt.Font;
import java.io.File;

public class SnakeFont {
	
	private Font font;
	private int size;
	
	public SnakeFont(int size) {
		if(size > 0) {
			this.size = size;
		}else {
			this.size = 90;
		}
		
		setFont(size);
		
	}
	
	public Font getFont() {
		return font;
	}
	
	private Font setFont(int size) {
		File file = new File("res/font/SnakeGameDemoRegular.ttf");
		try {
			System.out.println(file);
			font = Font.createFont(Font.TRUETYPE_FONT, file).deriveFont(Font.PLAIN, size);
	    } catch (Exception e) {
	        System.err.println("Impossibile caricare il font");
	        font = new Font("Arial", Font.PLAIN, size);
	    }
		
		return font;
	}
	
}
