package panels;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

import labels.SnakeBodyLabel;

import javax.swing.JLabel;

import labels.FoodLabel;
import labels.Snake;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Gaming extends JPanel {

	private static final long serialVersionUID = 1L;
	private CampoPanel campoPanel;
	private int score;
	private String level;
	private Snake snake;
	private Rectangle[] rec = new Rectangle[4];
	private FoodLabel food;
	private JLabel scoreLabel;
	private int y = 12 + new Random().nextInt(747 - 12 + 1);
	private int x = 21 + new Random().nextInt(879 - 21 + 1);
	private int y1 = 12 + new Random().nextInt(747 - 12 + 1);
	private int x1 = 21 + new Random().nextInt(879 - 21 + 1);
	

	/**
	 * Create the panel.
	 */
	public Gaming(String level) {
		setSize(920,850);
		setLayout(new BorderLayout(0, 0));
		
		this.level = level;
		
		campoPanel = new CampoPanel();
		campoPanel.setFocusable(true);
		campoPanel.requestFocusInWindow();
		campoPanel.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				int keyCode = e.getKeyCode();
				System.out.println(keyCode);
				if(keyCode == KeyEvent.VK_RIGHT) {
					x += 10;
					snake.setBounds(x, y, 40, 82);
				}
				
			}
		});
		add(campoPanel, BorderLayout.CENTER);
		campoPanel.setLayout(null);
		
		scoreLabel = new JLabel("Score: " + score);
		scoreLabel.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 60));
		scoreLabel.setBounds(10, 743, 349, 75);
		campoPanel.add(scoreLabel);
		
		JLabel levelLabel = new JLabel("Level: " + level);
		levelLabel.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 60));
		levelLabel.setBounds(533, 743, 349, 75);
		campoPanel.add(levelLabel);
		
		snake = new Snake();
		snake.setBounds(x, y, 20, 82);
		campoPanel.add(snake);
		
		rec = campoPanel.getRec();
		
		run();
		x = 200;
		spawnFood();
		
	}
	
	private void run() {
		switch(level) {
			case "Easy":
				running(100);
				break;
			
			case "Mid":
				running(35);
				break;
			
			case "Hard":
				running(20);
				break;
				
		}
			 
	}
	
	private void spawnFood() {
		food = new FoodLabel();
		food.setBounds(x1, y1, 40, 33);
		campoPanel.add(food);
	}
	
	private void running(int delay) {
		new Thread(()->{
			new Timer(delay, new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					
					y += 10;
					
					snake.setBounds(x, y, 20, 82);
					System.out.println(y);
					
					if(snake.getBounds().intersects(rec[0])|| snake.getBounds().intersects(rec[1]) 
						|| snake.getBounds().intersects(rec[2]) || snake.getBounds().intersects(rec[3])) { 
						
						((Timer) e.getSource()).stop();
					}
					
					if(snake.getBounds().intersects(food.getBounds())) {
						food.setBounds(-1,-1,-1,-1);
						campoPanel.remove(food);
						score++;
						scoreLabel.setText("Score: " + score);
						y1 = 12 + new Random().nextInt(747 - 12 + 1);
						x1 = 21 + new Random().nextInt(879 - 21 + 1);
						spawnFood();
					}
					
					
				}
				
			}).start();
		}).start();
	}
	
}
