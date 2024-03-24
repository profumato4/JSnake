package panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

import labels.SnakeBodyLabel;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JLabel;

import labels.FoodLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

public class Gaming extends JPanel {

	private static final long serialVersionUID = 1L;
	private CampoPanel campoPanel;
	private GameOver go;
	private int score;
	private String level;
	private Snake snake;
	private Rectangle[] rec = new Rectangle[4];
	private FoodLabel food;
	private JLabel scoreLabel;
	private int y = 11 + new Random().nextInt(683 - 11 + 1);
	private int x = 20 + new Random().nextInt(816 - 20 + 1);
	private int y1 = 11 + new Random().nextInt(683 - 11 + 1);
	private int x1 = 21 + new Random().nextInt(816 - 21 + 1);
	private int selezione = new Random().nextInt(4);  // 0. sopra 1. sotto 2. destra 3. sinistra
	
	/**
	 * Create the panel.
	 */
	public Gaming(String level) {
		setSize(920,850);
		
		this.level = level;
		
		
		
		campoPanel = new CampoPanel();
		campoPanel.setFocusable(true);	
		campoPanel.requestFocusInWindow();
		System.out.println(campoPanel.requestFocusInWindow() + " " + campoPanel.isFocusable());
		campoPanel.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				int keyCode = e.getKeyCode();
				System.out.println(keyCode);
				 switch (keyCode) {
		            case KeyEvent.VK_UP:
		                y -= 10;
		                
		                break;
		                
		            case KeyEvent.VK_DOWN:
		                y += 10;
		                
		                break;
		                
		            case KeyEvent.VK_RIGHT:
		                x += 10;
		                
		                break;
		                
		            case KeyEvent.VK_LEFT:
		                x -= 10;
		                
		                break;
		        }
				
			}
		});
		add(campoPanel, BorderLayout.CENTER);
		setLayout(null);

		
		campoPanel.setLayout(null);
		
		scoreLabel = new JLabel("Score: " + score);
		scoreLabel.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 60));
		scoreLabel.setBounds(10, 743, 349, 75);
		campoPanel.add(scoreLabel);
		
		JLabel levelLabel = new JLabel("Level: " + level);
		levelLabel.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 60));
		levelLabel.setBounds(533, 743, 349, 75);
		campoPanel.add(levelLabel);
		
		snake = new Snake(selezione);
		
		switch(selezione) {
			case 0:
				snake.setBounds(x, y, 20, 74);
				break;
				
			case 1:
				snake.setBounds(x, y, 20, 74);
				break;
			
			case 2:
				snake.setBounds(x, y, 74, 20);
				break;
				
			case 3:
				snake.setBounds(x, y, 74, 20);
				break;
		}
		
		
		campoPanel.add(snake);
		
		rec = campoPanel.getRec();
		
		run();
		spawnFood();
		
		System.out.println(selezione);
		
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
					
		/*			if(y + 10 > 683) {
						y = 683;
					}else {
						y += 10;
					}
			
					
					if(y -10 < 11) {
						y = 11;
					}else {
						y -= 10;
					}
					
					
					if(x - 10 < 20) {
						x = 20;
					}else {
						x -= 10;
				}
					
					if(x + 10 > 816) {
						x = 816;
					}else {
						x += 10;
					}
					
					snake.setBounds(x, y, 74, 20);
					//System.out.println(selezione);
		*/			
					
					switch(selezione) {
						case 0:
							
							up();
							
							snake.setBounds(x, y, 20, 74);
							break;
						
						case 1:
							
							down();
							
							snake.setBounds(x, y, 20, 74);
							break;
					
						case 2:
							
							right();
							
							snake.setBounds(x, y, 74, 20);
							break;
						
						case 3:
							
							left();
							
							snake.setBounds(x, y, 74, 20);
							break;
				}
					
					
					if(y == 683 || y == 11 || x == 816 || x == 20) {
						go = new GameOver();
						campoPanel.add(go, BorderLayout.CENTER);
						campoPanel.remove(food);
						snake.setOpaque(false);
						snake.setColor(new Color(0,0,0,96));
						audio("res/sounds/loseSound.wav");
						repaint();
						revalidate();
						((Timer) e.getSource()).stop();
					}
					
		/*			if(snake.getBounds().intersects(rec[0])|| snake.getBounds().intersects(rec[1]) 
						|| snake.getBounds().intersects(rec[2]) || snake.getBounds().intersects(rec[3])) { 
						
						System.out.println("out");
						
						((Timer) e.getSource()).stop();
					}
			*/		
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
		}).start();;
	}
	
	
	private void audio(String path) {
		new Thread(() -> {
			try {
				AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File(path));
				Clip clip = AudioSystem.getClip();
				clip.open(audioIn);
				clip.start();
			} catch (LineUnavailableException | UnsupportedAudioFileException | IOException e1) {
				e1.printStackTrace();
			}
		}).start();

	}
	
	private void up() {
		if(y -10 < 11) {
			y = 11;
		}else {
			y -= 10;
		}
		
	}
	
	private void down() {
		if(y + 10 > 683) {
			y = 683;
		}else {
			y += 10;
		}
	}
	
	private void left() {
		if(x - 10 < 20) {
			x = 20;
		}else {
			x -= 10;
		}
	}
	
	private void right() {
		if(x + 10 > 816) {
			x = 816;
		}else {
			x += 10;
		}
	}
	
}
