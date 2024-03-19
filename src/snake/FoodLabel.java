package snake;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JLabel;

public class FoodLabel extends JLabel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public FoodLabel() {
		setPreferredSize(new Dimension(40, 40));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g.create();

		int size = 10;

		g2d.fillRect(10, 10, size, size);
		g2d.fillRect(20, 0, size, size);
		g2d.fillRect(30, 10, size, size);
		g2d.fillRect(20, 20, size, size);

		g2d.dispose();
	}

}
