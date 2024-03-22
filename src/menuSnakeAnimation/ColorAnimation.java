package menuSnakeAnimation;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

import labels.SnakeBodyLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ColorAnimation extends JPanel implements Animation{

	private static final long serialVersionUID = 1L;
	private Timer t;
	private int i = 0;
	private Color [] colors = {Color.black, Color.blue, Color.cyan, Color.darkGray, Color.green, Color.lightGray, Color.magenta,
								Color.orange,Color.pink, Color.red, Color.white, Color.yellow};

	/**
	 * Create the panel.
	 */
	public ColorAnimation() {
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("clicked frocio");
			}
		});
		setSize(40,40);
		setLayout(null);
		setOpaque(false);
	}

	@Override
	public void startAnimation() {
		SnakeBodyLabel snakeBodyLabel = new SnakeBodyLabel(40);
		snakeBodyLabel.setBounds(0, 0, 40, 40);
		add(snakeBodyLabel);
		
		new Thread(() ->{
			
			t = new Timer(300, new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					snakeBodyLabel.setColor(colors[i]);
					i++;
					
					if(i == 12) {
						i = 0;
					}
					
				}
				
			}); 
				
			t.start();
			
		}).start();
		
	}

	@Override
	public void startAnimation(String level) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopAnimation() {
		SwingUtilities.invokeLater(() -> {
			t.stop();
			removeAll();
			revalidate();
			repaint();
		});	
		
	}

}
