package labels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JLabel;

public class SnakeBodyLabel extends JLabel  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Color bodyColor = Color.BLACK;
	private int size = 20;
	
	public SnakeBodyLabel() {
		setPreferredSize(new Dimension(40, 40));
	}
	
	public SnakeBodyLabel(int size) {
		this.size = size;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g.create();

		
		
		g2d.setColor(bodyColor);
		g2d.fillRect(0, 0, size, size);


		g2d.dispose();
	}
	
	public void setColor(Color color) {
		bodyColor = color;
		repaint();
	}
	
}
