package panels;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JPanel;

import labels.SnakeBodyLabel;

public class Snake extends JPanel {

	private static final long serialVersionUID = 1L;
	private ArrayList<SnakeBodyLabel> bodyParts;
	private Color bodyColor = Color.BLACK;
	private int size = 30;
	private int length = 3;
	private int n = 0;
	private int x;
	private int y;

	/**
	 * Create the panel.
	 */
	public Snake(int n) {
		bodyParts = new ArrayList<>();
		this.n = n;
		setLayout(null);
		setOpaque(false);
		setSize(30,30);
		
		for (int i = 0; i < length; i++) {
			SnakeBodyLabel bodyPart = new SnakeBodyLabel(size);
			
			if(n >= 0 && n <= 1) {
				bodyPart.setBounds(0, x, 74, 20); 
				x += 23;
			}else if(n >= 2 && n <= 3) {
				bodyPart.setBounds(y, 0, 20, 74); 
				y += 23;;
			}
			
			
			bodyPart.setColor(bodyColor);
			bodyParts.add(bodyPart);
			add(bodyPart);
		}

		setPreferredSize(new Dimension(length * (size + 5), size)); 
	}
	

	

	public void setColor(Color color) {
        bodyColor = color;
        for (SnakeBodyLabel bodyPart : bodyParts) {
            bodyPart.setColor(color);
        }
    }
}
