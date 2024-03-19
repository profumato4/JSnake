package snakeAnimation;

import java.awt.Color;

import javax.swing.JPanel;

public interface Animation{
	
	default void setPanel(JPanel panel) {
		panel.setBackground(new Color(46, 139, 87));
		panel.setSize(222, 226);
		panel.setLayout(null);
	}
	
	void startAnimation();
	
	void stopAnimation();
	
}
