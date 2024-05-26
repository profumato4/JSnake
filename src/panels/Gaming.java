package panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.Timer;

import labels.SnakeBodyLabel;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JLabel;

import labels.FoodLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Gaming extends JPanel implements Move{

	private static final long serialVersionUID = 1L;
	private CampoPanel campoPanel;
	private GameOver go;
	private int score;
	private String level;
	private Snake snake;
	private Rectangle[] rec = new Rectangle[4];
	private FoodLabel food;
	private JLabel scoreLabel;
	private ArrayList<SnakeBodyLabel> body;
	private ArrayList<Integer> snakeX = new ArrayList<>();
	private ArrayList<Integer> snakeY = new ArrayList<>();
	private int y = 11 + new Random().nextInt(683 - 11 + 1);
	private int x = 20 + new Random().nextInt(816 - 20 + 1);
	private int y1 = 11 + new Random().nextInt(683 - 11 + 1);
	private int x1 = 21 + new Random().nextInt(816 - 21 + 1);
	private byte selezione = (byte) new Random().nextInt(4);  // 0. sopra 1. sotto 2. destra 3. sinistra
	private int w = 0;
	private int h = 0;
	private Timer timer;
	private PausePanel pausePanel;
	private byte temp = 0; 
	private MenuPanel menu;
	private Gaming game = this;
	
	/**
	 * Create the panel.
	 */
	public Gaming(String level, MenuPanel menu) {
		setSize(920,850);
		
		this.level = level;
		this.menu = menu;
		
		setFocusable(false);
		
		campoPanel = new CampoPanel();		
		
		/*
		 * campoPanel.addKeyListener(new KeyAdapter() {
		 * 
		 * @Override public void keyPressed(KeyEvent e) {
		 * 
		 * int keyCode = e.getKeyCode(); System.out.println(keyCode); switch (keyCode) {
		 * case KeyEvent.VK_UP:
		 * 
		 * selezione = 0; break;
		 * 
		 * case KeyEvent.VK_DOWN:
		 * 
		 * selezione = 1; break;
		 * 
		 * case KeyEvent.VK_RIGHT:
		 * 
		 * selezione = 2; break;
		 * 
		 * case KeyEvent.VK_LEFT:
		 * 
		 * selezione = 3; break; }
		 * 
		 * } });
		 */
		
		
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
				
				w = 20;
				h = 74;
				
				snake.setBounds(x, y, w, h);
				break;
				
			case 1:
				
				w = 20;
				h = 74;
				
				snake.setBounds(x, y, w, h);
				break;
			
			case 2:
				
				w = 74;
				h = 20;
				
				snake.setBounds(x, y, w, h);
				break;
				
			case 3:
				
				w = 74;
				h = 20;
				
				snake.setBounds(x, y, w, h);
				break;
		}
		
		body = snake.getBodyParts();
		
		setCordinates();
		
		campoPanel.add(snake);
		
		rec = campoPanel.getRec();
		
		run();
		spawnFood();
		
		setupKeyBindings();
		
	//	System.out.println(selezione);
    //	campoPanel.setFocusable(true);
	//	campoPanel.setRequestFocusEnabled(true);
	//	campoPanel.grabFocus();
	//	campoPanel.requestFocus();
	//	campoPanel.requestFocusInWindow();
	//	campoPanel.repaint();
	//	campoPanel.revalidate();
	//	System.out.println(campoPanel.requestFocusInWindow() + " " + campoPanel.isFocusable());
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
	
	private void respawnFood() {
		x1 = 21 + new Random().nextInt(816 - 21 + 1);
		y1 = 11 + new Random().nextInt(683 - 11 + 1);
		food = new FoodLabel();
		food.setBounds(x1, y1, 40, 33);
		campoPanel.add(food);
	}
	
	private void running(int delay) {
		new Thread(() -> {
			timer = new Timer(delay, new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					/*
					 * if(y + 10 > 683) { y = 683; }else { y += 10; }
					 * 
					 * 
					 * if(y -10 < 11) { y = 11; }else { y -= 10; }
					 * 
					 * 
					 * if(x - 10 < 20) { x = 20; }else { x -= 10; }
					 * 
					 * if(x + 10 > 816) { x = 816; }else { x += 10; }
					 * 
					 * snake.setBounds(x, y, 74, 20); //System.out.println(selezione);
					 */

					switch (selezione) {
						case 0:
	
							up();
							
							w = 20;
							h = 74;
							
							setBodySize();
							snake.setBounds(x, y, w, h);
							break;

						case 1:
	
							down();
	
							w = 20;
							h = 74;
							
							setBodySize();
							snake.setBounds(x, y, w, h);
							break;

						case 2:
	
							right();
							
							w = 74;
							h = 20;
							
							setBodySize();
							snake.setBounds(x, y, w, h);
							break;

						case 3:
	
							left();
	
							w = 74;
							h = 20;
							
							setBodySize();
							snake.setBounds(x, y, w, h);
							break;
					}
					
	//				System.out.println("body " + body.get(0).getSize());
	//				System.out.println("snake" + snake.getSize());
					
					/*
					 * System.out.println(body.get(0).getBounds());
					 * System.out.println(body.get(1).getBounds());
					 * System.out.println(body.get(2).getBounds());
					 * 
					 */
					
					if (y == 683 || y == 11 || x == 816 || x == 20) {
						go = new GameOver(game, menu);
						campoPanel.add(go, BorderLayout.CENTER);
						campoPanel.remove(food);
						snake.setOpaque(false);
						snake.setColor(new Color(0, 0, 0, 96));
						audio("res/sounds/GameOver.wav");
						repaint();
						revalidate();
						((Timer) e.getSource()).stop();
					}

					/*
					 * if(snake.getBounds().intersects(rec[0])||
					 * snake.getBounds().intersects(rec[1]) || snake.getBounds().intersects(rec[2])
					 * || snake.getBounds().intersects(rec[3])) {
					 * 
					 * System.out.println("out");
					 * 
					 * ((Timer) e.getSource()).stop(); }
					 */
					if (snake.getBounds().intersects(food.getBounds())) {
						campoPanel.remove(food);
						respawnFood();
						score++;
						scoreLabel.setText("Score: " + score);
						y1 = 12 + new Random().nextInt(747 - 12 + 1);
						x1 = 21 + new Random().nextInt(879 - 21 + 1);
						repaint();
						revalidate();
					}

				}

			});
			timer.start();
		}).start();
		
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
		
		moveUp();
		updateBodyCoordinates();
	}
	
	private void down() {
		if(y + 10 > 683) {
			y = 683;
		}else {
			y += 10;
		}
		
		moveDown();
		updateBodyCoordinates();
	}
	
	private void left() {
		if(x - 10 < 20) {
			x = 20;
		}else {
			x -= 10;
		}
		
		moveLeft();
		updateBodyCoordinates();
	}
	
	private void right() {
		if(x + 10 > 816) {
			x = 816;
		}else {
			x += 10;
		}
		
		moveRight();
		updateBodyCoordinates();
	}
	
	
	@Override
	public void moveLeft() {
		for (int r = body.size() - 2; r > 0; r--) {
	//		System.out.println(r);
			snakeY.set(r + 1, snakeY.get(r));
		}

		for (int r = body.size() - 1; r >= 0; r--) {
			if (r == 0) {
				snakeX.set(r, snakeX.get(r) + 10);
			} else {
				snakeX.set(r, snakeX.get(r - 1));
			}
		}
		
	}

	@Override
	public void moveUp() {
		for (int r = body.size() - 2; r > 0; r--) {
			snakeX.set(r + 1, snakeX.get(r));
		}

		for (int r = body.size() - 1; r >= 0; r--) {
			if (r == 0) {
				snakeY.set(r, snakeY.get(r) + 10);
			} else {
				snakeY.set(r, snakeY.get(r - 1));
			}
		}
		
	}

	@Override
	public void moveDown() {
		for (int r = body.size() - 2; r > 0; r--) {
			snakeX.set(r + 1, snakeX.get(r));
		}

		for (int r = body.size() - 1; r >= 0; r--) {
			if (r == 0) {
				snakeY.set(r, snakeY.get(r) + 10);
			} else {
				snakeY.set(r, snakeY.get(r - 1));
			}
		}
		
	}
	
	

	@Override
	public void moveRight() {
		for (int r = body.size() - 2; r > 0; r--) {
			snakeY.set(r + 1, snakeY.get(r));
		}

		for (int r = body.size() - 1; r >= 0; r--) {
			if (r == 0) {
				snakeX.set(r, snakeX.get(r) + 10);
			} else {
				snakeX.set(r, snakeX.get(r - 1));
			}
		}
	}


	private void updateBodyCoordinates() {
/*		for (int i = body.size() - 1; i > 0; i--) {
			SnakeBodyLabel currentPart = body.get(i);
			SnakeBodyLabel previousPart = body.get(i - 1);
			currentPart.setLocation(previousPart.getLocation());
		}
		body.get(0).setLocation(x, y);
		snake.repaint();
		snake.revalidate();
*/	}

	private void setCordinates() {
		snakeX.add(body.get(2).getX());
		snakeX.add(body.get(1).getX());
		snakeX.add(body.get(0).getX());
		
		snakeY.add(body.get(2).getY());
		snakeY.add(body.get(1).getY());
		snakeY.add(body.get(0).getY());
	}
	
	public CampoPanel getCampoPanel() {
		return campoPanel;
	}
	
	private void setupKeyBindings() {
        InputMap inputMap = campoPanel.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW);
        ActionMap actionMap = campoPanel.getActionMap();

        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_UP, 0), "up");
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, 0), "down");
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, 0), "right");
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, 0), "left");
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "esc");

        actionMap.put("up", new AbstractAction() {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
            public void actionPerformed(ActionEvent e) {
				
				if(selezione == 1) {
					selezione = 1;
				}else {
					selezione = 0;
				}
				
         //       selezione = 0;
            }
        });

        actionMap.put("down", new AbstractAction() {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
            public void actionPerformed(ActionEvent e) {
				
				if(selezione == 0) {
					selezione = 0;
				}else {
					selezione = 1;
				}
				
            //    selezione = 1;
            }
        });

        actionMap.put("right", new AbstractAction() {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
            public void actionPerformed(ActionEvent e) {
				
				if(selezione == 3) {
					selezione = 3;
				}else {
					selezione = 2;
				}
				
               // selezione = 2;
            }
        });

        actionMap.put("left", new AbstractAction() {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
            public void actionPerformed(ActionEvent e) {
				
				if(selezione == 2) {
					selezione = 2;
				}else {
					selezione = 3;
				}
				
           //     selezione = 3;
            }
        });
        
        actionMap.put("esc", new AbstractAction() {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
            public void actionPerformed(ActionEvent e) {
				if (timer != null && timer.isRunning() && temp == 0) {
		            timer.stop();
		            pausePanel = new PausePanel(timer, new ResumeButtonListener() {

						@Override
						public void onResumeClicked(byte value) {
							temp = (byte) value;
						}
		            	
		            }, menu, game);
					campoPanel.add(pausePanel, BorderLayout.CENTER);
					campoPanel.repaint();
					campoPanel.revalidate();
					temp = 1;
		        }else if (timer != null && !timer.isRunning() && temp == 1){
		        	temp = 0;
		        	pausePanel.getResumeButton().doClick();
		        }
				System.out.println(temp);
            }
        });
        

        
    }
	
	public String getLevel() {
		return level;
	}
	
	private void setBodySize() {
/*		int x1 = x;
		int y1 = x;
		for(SnakeBodyLabel b : body) {
		//	b.paintImmediately(x, y, w, h);
			b.repaint(x1, y1, w, h);
			b.setSize(w, h);
			b.repaint();
			b.revalidate();
			x1 += 10;
			y1 += 10;
		}
	//	snake.repaint();
	//	snake.revalidate();
	//	snake.repaint(x, y, w, h);
*/	}
	
}