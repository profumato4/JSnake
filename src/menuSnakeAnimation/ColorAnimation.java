package menuSnakeAnimation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

import labels.SnakeBodyLabel;
import panels.ColorsPanel;
import panels.MenuPanel;

public class ColorAnimation extends JPanel implements Animation{

	private static final long serialVersionUID = 1L;
	private Timer t;
	private int i = 0;
	private Color [] colors = {Color.black, Color.blue, Color.cyan, Color.darkGray, Color.green, Color.lightGray, Color.magenta,
								Color.orange,Color.pink, Color.red, Color.white, Color.yellow, Color.decode("#FF1493"), Color.decode("#8A2BE2"),
								Color.decode("#008080"),Color.decode("#800000"),Color.decode("#FF4500"),Color.decode("#808000")};
	private ColorsPanel colorsPanel;

	/**
	 * Create the panel.
	 */
	public ColorAnimation(MenuPanel menu) {
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				colorsPanel = new ColorsPanel();
				colorsPanel.setVisible(true);
				menu.removeAll();
				menu.add(colorsPanel, BorderLayout.CENTER);
				menu.repaint();
				menu.revalidate();
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
