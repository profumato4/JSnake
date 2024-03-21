package menuSnakeAnimation;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JPanel;

public interface Animation{
	
	
	
	default void setPanel(JPanel panel) {
		panel.setBackground(new Color(46, 139, 87));
		panel.setSize(222, 226);
		panel.setLayout(null);
	}
	
	void startAnimation();
	void startAnimation(String level);
	
	void stopAnimation();
	
	default void audio(String path) {
		try {
			AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File(path));
			Clip clip = AudioSystem.getClip();
			clip.open(audioIn);
			clip.start();
		} catch (LineUnavailableException | UnsupportedAudioFileException | IOException e1) {
			e1.printStackTrace();
		}
	}
}
