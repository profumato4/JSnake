package panels;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Random;

import javax.swing.JPanel;

import labels.SnakeBodyLabel;

import javax.swing.JLabel;
import labels.Snake;

public class Gaming extends JPanel {

	private static final long serialVersionUID = 1L;
	private CampoPanel campoPanel;
	private int score;
	private String level;
	private int y = 12 + new Random().nextInt(747 - 12 + 1);
	private int x = 21 + new Random().nextInt(879 - 21 + 1);
	

	/**
	 * Create the panel.
	 */
	public Gaming(String level) {
		setSize(920,850);
		setLayout(new BorderLayout(0, 0));
		
		this.level = level;
		
		campoPanel = new CampoPanel();
		add(campoPanel, BorderLayout.CENTER);
		campoPanel.setLayout(null);
		
		JLabel scoreLabel = new JLabel("Score: " + score);
		scoreLabel.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 60));
		scoreLabel.setBounds(10, 743, 349, 75);
		campoPanel.add(scoreLabel);
		
		JLabel levelLabel = new JLabel("Level: " + level);
		levelLabel.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 60));
		levelLabel.setBounds(533, 743, 349, 75);
		campoPanel.add(levelLabel);
		
		Snake snake = new Snake();
		snake.setBounds(x, y, 40, 82);
		campoPanel.add(snake);
		
		
	}
}
