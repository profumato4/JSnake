package panels;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.File;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import labels.FoodLabel;
import menuSnakeAnimation.EasyAnimation;
import menuSnakeAnimation.HardAnimation;
import menuSnakeAnimation.MidAnimation;

public class MenuPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel text;
	private CampoPanel campoPanel;
	private Font font;
	private EasyAnimation easyAnimation;
	private MidAnimation midAnimation;
	private HardAnimation hardAnimation;

	/**
	 * Create the panel.
	 */
	public MenuPanel() {
		font = setFont();
		setSize(892, 764);
		setLayout(new BorderLayout(0, 0));
		
		campoPanel = new CampoPanel();
		add(campoPanel, BorderLayout.CENTER);
		campoPanel.setLayout(null);
		
		text = new JLabel("Snake");
		text.setFont(font);
		text.setBounds(348, 21, 174, 78);
		campoPanel.add(text);
		
		FoodLabel label = new FoodLabel();
		label.setBounds(292, 46, 46, 31);
		campoPanel.add(label);
		
		FoodLabel label_1 = new FoodLabel();
		label_1.setBounds(532, 46, 46, 31);
		campoPanel.add(label_1);
		
		
		JLabel text_1 = new JLabel("Choose Level");
		text_1.setFont(font);
		text_1.setBounds(240, 187, 499, 78);
		campoPanel.add(text_1);
		
		setupButtons();
		animations();
		
	}
	
	private Font setFont() {
		File file = new File("res/font/SnakeGameDemoRegular.ttf");
		Font font = null;
		try {
			System.out.println(file);
			font = Font.createFont(Font.TRUETYPE_FONT, file).deriveFont(Font.PLAIN, 90);
	    } catch (Exception e) {
	        System.err.println("Impossibile caricare il font");
	        font = new Font("Arial", Font.PLAIN, 30);
	    }
		
		return font;
	}
	
	private void setupButtons() {
		JButton easyButton = new JButton("Easy");
		easyButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				easyAnimation.startAnimation();
				easyAnimation.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				easyAnimation.stopAnimation();
				easyAnimation.setVisible(false);
			}
		});
		easyButton.setFocusPainted(false);
		easyButton.setBorderPainted(false);
		easyButton.setContentAreaFilled(false);
		easyButton.setFont(font);
		easyButton.setBounds(22, 566, 270, 78);
		campoPanel.add(easyButton);
		
		JButton midButton = new JButton("Mid");
		midButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				midAnimation.startAnimation();
				midAnimation.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				midAnimation.stopAnimation();
				midAnimation.setVisible(false);
			}
		});
		midButton.setFont(font);
		midButton.setFocusPainted(false);
		midButton.setContentAreaFilled(false);
		midButton.setBorderPainted(false);
		midButton.setBounds(292, 566, 183, 78);
		campoPanel.add(midButton);
		
		JButton hardButton = new JButton("Hard");
		hardButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				hardAnimation.startAnimation();
				hardAnimation.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				hardAnimation.stopAnimation();
				hardAnimation.setVisible(false);
			}
		});
		hardButton.setFont(font);
		hardButton.setFocusPainted(false);
		hardButton.setContentAreaFilled(false);
		hardButton.setBorderPainted(false);
		hardButton.setBounds(542, 566, 222, 78);
		campoPanel.add(hardButton);
		
		
	}
	
	private void animations() {
		easyAnimation = new EasyAnimation();
		easyAnimation.setBounds(70, 340, 222, 226);
		easyAnimation.setVisible(false);
		campoPanel.add(easyAnimation);
		
		midAnimation = new MidAnimation();
		midAnimation.setBounds(302, 340, 222, 226);
		midAnimation.setVisible(false);
		campoPanel.add(midAnimation);
		
		hardAnimation = new HardAnimation();
		hardAnimation.setBounds(542, 340, 222, 226);
		hardAnimation.setVisible(false);
		campoPanel.add(hardAnimation);
	}
	
}
