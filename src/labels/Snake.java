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
	private int n = 0;

	public Snake() {
		setPreferredSize(new Dimension(40, 40));
	}
	
	public Snake(int n) {
		setPreferredSize(new Dimension(40, 40));
		this.n = n;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g.create();

		int size = 20;
		
		
		if(n >= 0 && n <= 1) {
			g2d.fillRect(0, 0, size, size);
			g2d.fillRect(0, 23, size, size);
			g2d.fillRect(0, 46, size, size);
		}else if(n >= 2 && n <= 3) {
			g2d.fillRect(0, 0, size, size);
			g2d.fillRect(23, 0, size, size);
			g2d.fillRect(46, 0, size, size);
		}
		
		
			
		
		


		g2d.dispose();
	}
	
}
