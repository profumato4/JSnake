package labels;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JLabel;

public class Snake extends JLabel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Snake() {
		setPreferredSize(new Dimension(40, 40));
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g.create();

		int size = 20;

		g2d.fillRect(0, 10, size, size);
		g2d.fillRect(0, 33, size, size);
		g2d.fillRect(0, 56, size, size);


		g2d.dispose();
	}
	
}
