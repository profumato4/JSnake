package snakeAnimation;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

import snake.SnakeBodyLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.File;


public class EasyAnimation extends JPanel implements Animation{

	private static final long serialVersionUID = 1L;
	private SnakeBodyLabel sn;
	private SnakeBodyLabel sn1;
	private SnakeBodyLabel sn2;
	private Timer t;

	/**
	 * Create the panel.
	 */
	public EasyAnimation() {
		setPanel(this);
	}
	
	@Override
	public void startAnimation() {
		sn = new SnakeBodyLabel();
		sn.setBounds(10, 196, 30, 30);
		add(sn);

		new Thread(() -> {
			audio();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			sn.setBounds(10, 196 - 22, 30, 30);
			sn1 = new SnakeBodyLabel();
			sn1.setBounds(10, 196, 30, 30);
			add(sn1);

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			sn.setBounds(10, 196 - 44, 30, 30);
			sn1.setBounds(10, 196 - 22, 30, 30);
			sn2 = new SnakeBodyLabel();
			sn2.setBounds(10, 196, 30, 30);
			add(sn2);

			t = new Timer(100, new ActionListener() {
				private int x1 = sn.getX();
				private int x2 = sn1.getX();
				private int x3 = sn2.getX();

				private int y1 = sn.getY();
				private int y2 = sn1.getY();
				private int y3 = sn2.getY();
				private int size = 30;

				@Override
				public void actionPerformed(ActionEvent e) {

					if (x1 == 10) {

						y1 = Math.max(y1 - 10, 101);

						sn.setBounds(x1, y1, size, size);

					}

					if (x2 == 10) {
						y2 = Math.max(y2 - 10, 101);

						sn1.setBounds(x2, y2, size, size);
					}

					if (x3 == 10) {
						y3 = Math.max(y3 - 10, 101);

						sn2.setBounds(x3, y3, size, size);
					}

					if (y1 == 101) {
						x1 = Math.min(x1 + 13, 120);
						sn.setBounds(x1, y1, size, size);
					}

					if (y2 == 101) {
						x2 = Math.min(x2 + 13, 120);
						;
						sn1.setBounds(x2, y2, size, size);
					}

					if (y3 == 101) {
						x3 = Math.min(x3 + 13, 120);
						;
						sn2.setBounds(x3, y3, size, size);
					}

					if (x1 == 120) {
						y1 = Math.min(y1 + 13, 231);
						sn.setBounds(x1, y1, size, size);
					}

					if (x2 == 120) {
						y2 = Math.min(y2 + 13, 231);
						;
						sn1.setBounds(x2, y2, size, size);
					}

					if (x3 == 120) {
						y3 = Math.min(y3 + 13, 231);
						;
						sn2.setBounds(x3, y3, size, size);
					}

					if (x3 == 120 && y3 == 231) {
						((Timer) e.getSource()).stop();
					}

				}

			});
			
			t.start();

		}).start();
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
