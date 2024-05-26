package panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import labels.SnakeBodyLabel;
import menuSnakeAnimation.ColorsAnimation;

public class ColorsPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private MenuPanel menu;
	private ColorsAnimation ca = new ColorsAnimation();;

	/**
	 * Create the panel.
	 */
	public ColorsPanel() {
		setSize(920,850);
		setLayout(null);
		setBackground(new Color(46, 139, 87));
		setUp();
		setOpaqueFalseForAllPanels(this);
		setFontForAllLabels(this, new Font("Tempus Sans ITC", Font.BOLD, 60));
		setColorForAllLabels(this, Color.black);
		
		
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				removeAll();
				menu = new MenuPanel();
				menu.setVisible(true);
				add(menu, BorderLayout.CENTER);
				repaint();
				revalidate();
			}
		});
		lblNewLabel.setIcon(new ImageIcon("res/backArrow.png"));
		lblNewLabel.setBounds(10, 0, 276, 51);
		add(lblNewLabel);
	}
	
	private void setUp() {
		JLabel c1 = new JLabel("1.");
		c1.setFont(new Font("Tahoma", Font.BOLD, 60));
		c1.setBounds(10, 62, 59, 73);
		add(c1);
		
		JLabel c2 = new JLabel("2.");
		c2.setFont(new Font("Tahoma", Font.PLAIN, 60));
		c2.setBounds(10, 149, 59, 73);
		add(c2);
		
		JLabel c3 = new JLabel("3.");
		c3.setFont(new Font("Tahoma", Font.PLAIN, 60));
		c3.setBounds(10, 233, 59, 73);
		add(c3);
		
		JLabel c4 = new JLabel("4.");
		c4.setFont(new Font("Tahoma", Font.PLAIN, 60));
		c4.setBounds(10, 317, 59, 73);
		add(c4);
		
		JLabel c5 = new JLabel("5.");
		c5.setFont(new Font("Tahoma", Font.PLAIN, 60));
		c5.setBounds(10, 401, 59, 73);
		add(c5);
		
		JLabel c6 = new JLabel("6.");
		c6.setFont(new Font("Tahoma", Font.PLAIN, 60));
		c6.setBounds(10, 485, 59, 73);
		add(c6);
		
		JLabel c7 = new JLabel("7.");
		c7.setFont(new Font("Tahoma", Font.PLAIN, 60));
		c7.setBounds(10, 569, 59, 73);
		add(c7);
		
		JLabel c8 = new JLabel("8.");
		c8.setFont(new Font("Tahoma", Font.PLAIN, 60));
		c8.setBounds(10, 653, 59, 73);
		add(c8);
		
		JLabel c9 = new JLabel("9.");
		c9.setFont(new Font("Tahoma", Font.PLAIN, 60));
		c9.setBounds(10, 737, 59, 73);
		add(c9);
		
		JLabel c10 = new JLabel("10.");
		c10.setFont(new Font("Tahoma", Font.PLAIN, 60));
		c10.setBounds(495, 62, 100, 73);
		add(c10);
		
		JLabel c11 = new JLabel("11.");
		c11.setFont(new Font("Tahoma", Font.PLAIN, 60));
		c11.setBounds(495, 145, 100, 73);
		add(c11);
		
		JLabel c12 = new JLabel("12.");
		c12.setFont(new Font("Tahoma", Font.PLAIN, 60));
		c12.setBounds(495, 229, 100, 73);
		add(c12);
		
		JLabel c13 = new JLabel("13.");
		c13.setFont(new Font("Tahoma", Font.PLAIN, 60));
		c13.setBounds(495, 328, 100, 73);
		add(c13);
		
		JLabel c14 = new JLabel("14.");
		c14.setFont(new Font("Tahoma", Font.PLAIN, 60));
		c14.setBounds(495, 412, 100, 73);
		add(c14);
		
		JLabel c15 = new JLabel("15.");
		c15.setFont(new Font("Tahoma", Font.PLAIN, 60));
		c15.setBounds(495, 496, 100, 73);
		add(c15);
		
		JLabel c16 = new JLabel("16.");
		c16.setFont(new Font("Tahoma", Font.PLAIN, 60));
		c16.setBounds(495, 580, 100, 73);
		add(c16);
		
		JLabel c17 = new JLabel("17.");
		c17.setFont(new Font("Tahoma", Font.PLAIN, 60));
		c17.setBounds(495, 664, 100, 73);
		add(c17);
		
		JLabel c18 = new JLabel("18.");
		c18.setFont(new Font("Tahoma", Font.PLAIN, 60));
		c18.setBounds(495, 748, 100, 73);
		add(c18);
		
		JPanel panel = new JPanel();
		panel.setBounds(79, 80, 172, 40);
		add(panel);
		panel.setLayout(null);
		
		SnakeBodyLabel snakeBodyLabel = new SnakeBodyLabel(40);
		snakeBodyLabel.setBounds(0, 0, 40, 40);
		panel.add(snakeBodyLabel);
		
		SnakeBodyLabel snakeBodyLabel_1 = new SnakeBodyLabel(40);
		snakeBodyLabel_1.setBounds(45, 0, 40, 40);
		panel.add(snakeBodyLabel_1);
		
		SnakeBodyLabel snakeBodyLabel_2 = new SnakeBodyLabel(40);
		snakeBodyLabel_2.setBounds(89, 0, 40, 40);
		panel.add(snakeBodyLabel_2);
		
		SnakeBodyLabel snakeBodyLabel_1_1 = new SnakeBodyLabel(40);
		snakeBodyLabel_1_1.setBounds(132, 0, 40, 40);
		panel.add(snakeBodyLabel_1_1);
		
		ca.moveSnake(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(79, 171, 172, 40);
		add(panel_1);
		
		SnakeBodyLabel snakeBodyLabel_3 = new SnakeBodyLabel(40);
		snakeBodyLabel_3.setBounds(0, 0, 40, 40);
		snakeBodyLabel_3.setColor(Color.blue);
		panel_1.add(snakeBodyLabel_3);
		
		SnakeBodyLabel snakeBodyLabel_1_2 = new SnakeBodyLabel(40);
		snakeBodyLabel_1_2.setBounds(45, 0, 40, 40);
		snakeBodyLabel_1_2.setColor(Color.blue);
		panel_1.add(snakeBodyLabel_1_2);
		
		SnakeBodyLabel snakeBodyLabel_2_1 = new SnakeBodyLabel(40);
		snakeBodyLabel_2_1.setBounds(89, 0, 40, 40);
		snakeBodyLabel_2_1.setColor(Color.blue);
		panel_1.add(snakeBodyLabel_2_1);
		
		SnakeBodyLabel snakeBodyLabel_1_1_1 = new SnakeBodyLabel(40);
		snakeBodyLabel_1_1_1.setBounds(132, 0, 40, 40);
		snakeBodyLabel_1_1_1.setColor(Color.blue);
		panel_1.add(snakeBodyLabel_1_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(79, 251, 172, 40);
		add(panel_2);
		
		SnakeBodyLabel snakeBodyLabel_4 = new SnakeBodyLabel(40);
		snakeBodyLabel_4.setBounds(0, 0, 40, 40);
		snakeBodyLabel_4.setColor(Color.cyan);
		panel_2.add(snakeBodyLabel_4);
		
		SnakeBodyLabel snakeBodyLabel_1_3 = new SnakeBodyLabel(40);
		snakeBodyLabel_1_3.setBounds(45, 0, 40, 40);
		snakeBodyLabel_1_3.setColor(Color.cyan);
		panel_2.add(snakeBodyLabel_1_3);
		
		SnakeBodyLabel snakeBodyLabel_2_2 = new SnakeBodyLabel(40);
		snakeBodyLabel_2_2.setBounds(89, 0, 40, 40);
		snakeBodyLabel_2_2.setColor(Color.cyan);
		panel_2.add(snakeBodyLabel_2_2);
		
		SnakeBodyLabel snakeBodyLabel_1_1_2 = new SnakeBodyLabel(40);
		snakeBodyLabel_1_1_2.setBounds(132, 0, 40, 40);
		snakeBodyLabel_1_1_2.setColor(Color.cyan);
		panel_2.add(snakeBodyLabel_1_1_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(79, 328, 172, 40);
		add(panel_1_1);
		
		SnakeBodyLabel snakeBodyLabel_3_2 = new SnakeBodyLabel(40);
		snakeBodyLabel_3_2.setBounds(0, 0, 40, 40);
		snakeBodyLabel_3_2.setColor(Color.darkGray);
		panel_1_1.add(snakeBodyLabel_3_2);
		
		SnakeBodyLabel snakeBodyLabel_1_2_2 = new SnakeBodyLabel(40);
		snakeBodyLabel_1_2_2.setBounds(45, 0, 40, 40);
		snakeBodyLabel_1_2_2.setColor(Color.darkGray);
		panel_1_1.add(snakeBodyLabel_1_2_2);
		
		SnakeBodyLabel snakeBodyLabel_2_1_2 = new SnakeBodyLabel(40);
		snakeBodyLabel_2_1_2.setBounds(89, 0, 40, 40);
		snakeBodyLabel_2_1_2.setColor(Color.darkGray);
		panel_1_1.add(snakeBodyLabel_2_1_2);
		
		SnakeBodyLabel snakeBodyLabel_1_1_1_2 = new SnakeBodyLabel(40);
		snakeBodyLabel_1_1_1_2.setBounds(132, 0, 40, 40);
		snakeBodyLabel_1_1_1_2.setColor(Color.darkGray);
		panel_1_1.add(snakeBodyLabel_1_1_1_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(79, 412, 172, 40);
		add(panel_3);
		
		SnakeBodyLabel snakeBodyLabel_5 = new SnakeBodyLabel(40);
		snakeBodyLabel_5.setBounds(0, 0, 40, 40);
		snakeBodyLabel_5.setColor(Color.green);
		panel_3.add(snakeBodyLabel_5);
		
		SnakeBodyLabel snakeBodyLabel_1_4 = new SnakeBodyLabel(40);
		snakeBodyLabel_1_4.setBounds(45, 0, 40, 40);
		snakeBodyLabel_1_4.setColor(Color.green);
		panel_3.add(snakeBodyLabel_1_4);
		
		SnakeBodyLabel snakeBodyLabel_2_3 = new SnakeBodyLabel(40);
		snakeBodyLabel_2_3.setBounds(89, 0, 40, 40);
		snakeBodyLabel_2_3.setColor(Color.green);
		panel_3.add(snakeBodyLabel_2_3);
		
		SnakeBodyLabel snakeBodyLabel_1_1_3 = new SnakeBodyLabel(40);
		snakeBodyLabel_1_1_3.setBounds(132, 0, 40, 40);
		snakeBodyLabel_1_1_3.setColor(Color.green);
		panel_3.add(snakeBodyLabel_1_1_3);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBounds(79, 503, 172, 40);
		add(panel_1_2);
		
		SnakeBodyLabel snakeBodyLabel_3_3 = new SnakeBodyLabel(40);
		snakeBodyLabel_3_3.setBounds(0, 0, 40, 40);
		snakeBodyLabel_3_3.setColor(Color.lightGray);
		panel_1_2.add(snakeBodyLabel_3_3);
		
		SnakeBodyLabel snakeBodyLabel_1_2_3 = new SnakeBodyLabel(40);
		snakeBodyLabel_1_2_3.setBounds(45, 0, 40, 40);
		snakeBodyLabel_1_2_3.setColor(Color.lightGray);
		panel_1_2.add(snakeBodyLabel_1_2_3);
		
		SnakeBodyLabel snakeBodyLabel_2_1_3 = new SnakeBodyLabel(40);
		snakeBodyLabel_2_1_3.setBounds(89, 0, 40, 40);
		snakeBodyLabel_2_1_3.setColor(Color.lightGray);
		panel_1_2.add(snakeBodyLabel_2_1_3);
		
		SnakeBodyLabel snakeBodyLabel_1_1_1_3 = new SnakeBodyLabel(40);
		snakeBodyLabel_1_1_1_3.setBounds(132, 0, 40, 40);
		snakeBodyLabel_1_1_1_3.setColor(Color.lightGray);
		panel_1_2.add(snakeBodyLabel_1_1_1_3);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBounds(79, 583, 172, 40);
		add(panel_2_1);
		
		SnakeBodyLabel snakeBodyLabel_4_2 = new SnakeBodyLabel(40);
		snakeBodyLabel_4_2.setBounds(0, 0, 40, 40);
		snakeBodyLabel_4_2.setColor(Color.magenta);
		panel_2_1.add(snakeBodyLabel_4_2);
		
		SnakeBodyLabel snakeBodyLabel_1_3_2 = new SnakeBodyLabel(40);
		snakeBodyLabel_1_3_2.setBounds(45, 0, 40, 40);
		snakeBodyLabel_1_3_2.setColor(Color.magenta);
		panel_2_1.add(snakeBodyLabel_1_3_2);
		
		SnakeBodyLabel snakeBodyLabel_2_2_2 = new SnakeBodyLabel(40);
		snakeBodyLabel_2_2_2.setBounds(89, 0, 40, 40);
		snakeBodyLabel_2_2_2.setColor(Color.magenta);
		panel_2_1.add(snakeBodyLabel_2_2_2);
		
		SnakeBodyLabel snakeBodyLabel_1_1_2_2 = new SnakeBodyLabel(40);
		snakeBodyLabel_1_1_2_2.setBounds(132, 0, 40, 40);
		snakeBodyLabel_1_1_2_2.setColor(Color.magenta);
		panel_2_1.add(snakeBodyLabel_1_1_2_2);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBounds(79, 664, 172, 40);
		add(panel_1_1_1);
		
		SnakeBodyLabel snakeBodyLabel_3_2_1 = new SnakeBodyLabel(40);
		snakeBodyLabel_3_2_1.setBounds(0, 0, 40, 40);
		snakeBodyLabel_3_2_1.setColor(Color.orange);
		panel_1_1_1.add(snakeBodyLabel_3_2_1);
		
		SnakeBodyLabel snakeBodyLabel_1_2_2_1 = new SnakeBodyLabel(40);
		snakeBodyLabel_1_2_2_1.setBounds(45, 0, 40, 40);
		snakeBodyLabel_1_2_2_1.setColor(Color.orange);
		panel_1_1_1.add(snakeBodyLabel_1_2_2_1);
		
		SnakeBodyLabel snakeBodyLabel_2_1_2_1 = new SnakeBodyLabel(40);
		snakeBodyLabel_2_1_2_1.setBounds(89, 0, 40, 40);
		snakeBodyLabel_2_1_2_1.setColor(Color.orange);
		panel_1_1_1.add(snakeBodyLabel_2_1_2_1);
		
		SnakeBodyLabel snakeBodyLabel_1_1_1_2_1 = new SnakeBodyLabel(40);
		snakeBodyLabel_1_1_1_2_1.setBounds(132, 0, 40, 40);
		snakeBodyLabel_1_1_1_2_1.setColor(Color.orange);
		panel_1_1_1.add(snakeBodyLabel_1_1_1_2_1);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBounds(79, 749, 172, 40);
		add(panel_2_1_1);
		
		SnakeBodyLabel snakeBodyLabel_4_2_1 = new SnakeBodyLabel(40);
		snakeBodyLabel_4_2_1.setBounds(0, 0, 40, 40);
		snakeBodyLabel_4_2_1.setColor(Color.pink);
		panel_2_1_1.add(snakeBodyLabel_4_2_1);
		
		SnakeBodyLabel snakeBodyLabel_1_3_2_1 = new SnakeBodyLabel(40);
		snakeBodyLabel_1_3_2_1.setBounds(45, 0, 40, 40);
		snakeBodyLabel_1_3_2_1.setColor(Color.pink);
		panel_2_1_1.add(snakeBodyLabel_1_3_2_1);
		
		SnakeBodyLabel snakeBodyLabel_2_2_2_1 = new SnakeBodyLabel(40);
		snakeBodyLabel_2_2_2_1.setBounds(89, 0, 40, 40);
		snakeBodyLabel_2_2_2_1.setColor(Color.pink);
		panel_2_1_1.add(snakeBodyLabel_2_2_2_1);
		
		SnakeBodyLabel snakeBodyLabel_1_1_2_2_1 = new SnakeBodyLabel(40);
		snakeBodyLabel_1_1_2_2_1.setBounds(132, 0, 40, 40);
		snakeBodyLabel_1_1_2_2_1.setColor(Color.pink);
		panel_2_1_1.add(snakeBodyLabel_1_1_2_2_1);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBounds(615, 73, 172, 40);
		add(panel_1_1_1_1);
		
		SnakeBodyLabel snakeBodyLabel_3_2_1_1 = new SnakeBodyLabel(40);
		snakeBodyLabel_3_2_1_1.setBounds(0, 0, 40, 40);
		snakeBodyLabel_3_2_1_1.setColor(Color.red);
		panel_1_1_1_1.add(snakeBodyLabel_3_2_1_1);
		
		SnakeBodyLabel snakeBodyLabel_1_2_2_1_1 = new SnakeBodyLabel(40);
		snakeBodyLabel_1_2_2_1_1.setBounds(45, 0, 40, 40);
		snakeBodyLabel_1_2_2_1_1.setColor(Color.red);
		panel_1_1_1_1.add(snakeBodyLabel_1_2_2_1_1);
		
		SnakeBodyLabel snakeBodyLabel_2_1_2_1_1 = new SnakeBodyLabel(40);
		snakeBodyLabel_2_1_2_1_1.setBounds(89, 0, 40, 40);
		snakeBodyLabel_2_1_2_1_1.setColor(Color.red);
		panel_1_1_1_1.add(snakeBodyLabel_2_1_2_1_1);
		
		SnakeBodyLabel snakeBodyLabel_1_1_1_2_1_1 = new SnakeBodyLabel(40);
		snakeBodyLabel_1_1_1_2_1_1.setBounds(132, 0, 40, 40);
		snakeBodyLabel_1_1_1_2_1_1.setColor(Color.red);
		panel_1_1_1_1.add(snakeBodyLabel_1_1_1_2_1_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBounds(615, 156, 172, 40);
		add(panel_4);
		
		SnakeBodyLabel snakeBodyLabel_6 = new SnakeBodyLabel(40);
		snakeBodyLabel_6.setBounds(0, 0, 40, 40);
		snakeBodyLabel_6.setColor(Color.white);
		panel_4.add(snakeBodyLabel_6);
		
		SnakeBodyLabel snakeBodyLabel_1_5 = new SnakeBodyLabel(40);
		snakeBodyLabel_1_5.setBounds(45, 0, 40, 40);
		snakeBodyLabel_1_5.setColor(Color.white);
		panel_4.add(snakeBodyLabel_1_5);
		
		SnakeBodyLabel snakeBodyLabel_2_4 = new SnakeBodyLabel(40);
		snakeBodyLabel_2_4.setBounds(89, 0, 40, 40);
		snakeBodyLabel_2_4.setColor(Color.white);
		panel_4.add(snakeBodyLabel_2_4);
		
		SnakeBodyLabel snakeBodyLabel_1_1_4 = new SnakeBodyLabel(40);
		snakeBodyLabel_1_1_4.setBounds(132, 0, 40, 40);
		snakeBodyLabel_1_1_4.setColor(Color.white);
		panel_4.add(snakeBodyLabel_1_1_4);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBounds(615, 244, 172, 40);
		add(panel_1_3);
		
		SnakeBodyLabel snakeBodyLabel_3_1 = new SnakeBodyLabel(40);
		snakeBodyLabel_3_1.setBounds(0, 0, 40, 40);
		snakeBodyLabel_3_1.setColor(Color.yellow);
		panel_1_3.add(snakeBodyLabel_3_1);
		
		SnakeBodyLabel snakeBodyLabel_1_2_1 = new SnakeBodyLabel(40);
		snakeBodyLabel_1_2_1.setBounds(45, 0, 40, 40);
		snakeBodyLabel_1_2_1.setColor(Color.yellow);
		panel_1_3.add(snakeBodyLabel_1_2_1);
		
		SnakeBodyLabel snakeBodyLabel_2_1_1 = new SnakeBodyLabel(40);
		snakeBodyLabel_2_1_1.setBounds(89, 0, 40, 40);
		snakeBodyLabel_2_1_1.setColor(Color.yellow);
		panel_1_3.add(snakeBodyLabel_2_1_1);
		
		SnakeBodyLabel snakeBodyLabel_1_1_1_1 = new SnakeBodyLabel(40);
		snakeBodyLabel_1_1_1_1.setBounds(132, 0, 40, 40);
		snakeBodyLabel_1_1_1_1.setColor(Color.yellow);
		panel_1_3.add(snakeBodyLabel_1_1_1_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBounds(615, 328, 172, 40);
		add(panel_2_2);
		
		SnakeBodyLabel snakeBodyLabel_4_1 = new SnakeBodyLabel(40);
		snakeBodyLabel_4_1.setBounds(0, 0, 40, 40);
		snakeBodyLabel_4_1.setColor(Color.decode("#FF1493"));
		panel_2_2.add(snakeBodyLabel_4_1);
		
		SnakeBodyLabel snakeBodyLabel_1_3_1 = new SnakeBodyLabel(40);
		snakeBodyLabel_1_3_1.setBounds(45, 0, 40, 40);
		snakeBodyLabel_1_3_1.setColor(Color.decode("#FF1493"));
		panel_2_2.add(snakeBodyLabel_1_3_1);
		
		SnakeBodyLabel snakeBodyLabel_2_2_1 = new SnakeBodyLabel(40);
		snakeBodyLabel_2_2_1.setBounds(89, 0, 40, 40);
		snakeBodyLabel_2_2_1.setColor(Color.decode("#FF1493"));
		panel_2_2.add(snakeBodyLabel_2_2_1);
		
		SnakeBodyLabel snakeBodyLabel_1_1_2_1 = new SnakeBodyLabel(40);
		snakeBodyLabel_1_1_2_1.setBounds(132, 0, 40, 40);
		snakeBodyLabel_1_1_2_1.setColor(Color.decode("#FF1493"));
		panel_2_2.add(snakeBodyLabel_1_1_2_1);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setBounds(615, 412, 172, 40);
		add(panel_1_1_2);
		
		SnakeBodyLabel snakeBodyLabel_3_2_2 = new SnakeBodyLabel(40);
		snakeBodyLabel_3_2_2.setBounds(0, 0, 40, 40);
		snakeBodyLabel_3_2_2.setColor(Color.decode("#8A2BE2"));
		panel_1_1_2.add(snakeBodyLabel_3_2_2);
		
		SnakeBodyLabel snakeBodyLabel_1_2_2_2 = new SnakeBodyLabel(40);
		snakeBodyLabel_1_2_2_2.setBounds(45, 0, 40, 40);
		snakeBodyLabel_1_2_2_2.setColor(Color.decode("#8A2BE2"));
		panel_1_1_2.add(snakeBodyLabel_1_2_2_2);
		
		SnakeBodyLabel snakeBodyLabel_2_1_2_2 = new SnakeBodyLabel(40);
		snakeBodyLabel_2_1_2_2.setBounds(89, 0, 40, 40);
		snakeBodyLabel_2_1_2_2.setColor(Color.decode("#8A2BE2"));
		panel_1_1_2.add(snakeBodyLabel_2_1_2_2);
		
		SnakeBodyLabel snakeBodyLabel_1_1_1_2_2 = new SnakeBodyLabel(40);
		snakeBodyLabel_1_1_1_2_2.setBounds(132, 0, 40, 40);
		snakeBodyLabel_1_1_1_2_2.setColor(Color.decode("#8A2BE2"));
		panel_1_1_2.add(snakeBodyLabel_1_1_1_2_2);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBounds(615, 496, 172, 40);
		add(panel_3_1);
		
		SnakeBodyLabel snakeBodyLabel_5_1 = new SnakeBodyLabel(40);
		snakeBodyLabel_5_1.setBounds(0, 0, 40, 40);
		snakeBodyLabel_5_1.setColor(Color.decode("#008080"));
		panel_3_1.add(snakeBodyLabel_5_1);
		
		SnakeBodyLabel snakeBodyLabel_1_4_1 = new SnakeBodyLabel(40);
		snakeBodyLabel_1_4_1.setBounds(45, 0, 40, 40);
		snakeBodyLabel_1_4_1.setColor(Color.decode("#008080"));
		panel_3_1.add(snakeBodyLabel_1_4_1);
		
		SnakeBodyLabel snakeBodyLabel_2_3_1 = new SnakeBodyLabel(40);
		snakeBodyLabel_2_3_1.setBounds(89, 0, 40, 40);
		snakeBodyLabel_2_3_1.setColor(Color.decode("#008080"));
		panel_3_1.add(snakeBodyLabel_2_3_1);
		
		SnakeBodyLabel snakeBodyLabel_1_1_3_1 = new SnakeBodyLabel(40);
		snakeBodyLabel_1_1_3_1.setBounds(132, 0, 40, 40);
		snakeBodyLabel_1_1_3_1.setColor(Color.decode("#008080"));
		panel_3_1.add(snakeBodyLabel_1_1_3_1);
		
		JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setLayout(null);
		panel_1_2_1.setBounds(615, 587, 172, 40);
		add(panel_1_2_1);
		
		SnakeBodyLabel snakeBodyLabel_3_3_1 = new SnakeBodyLabel(40);
		snakeBodyLabel_3_3_1.setBounds(0, 0, 40, 40);
		snakeBodyLabel_3_3_1.setColor(Color.decode("#800000"));
		panel_1_2_1.add(snakeBodyLabel_3_3_1);
		
		SnakeBodyLabel snakeBodyLabel_1_2_3_1 = new SnakeBodyLabel(40);
		snakeBodyLabel_1_2_3_1.setBounds(45, 0, 40, 40);
		snakeBodyLabel_1_2_3_1.setColor(Color.decode("#800000"));
		panel_1_2_1.add(snakeBodyLabel_1_2_3_1);
		
		SnakeBodyLabel snakeBodyLabel_2_1_3_1 = new SnakeBodyLabel(40);
		snakeBodyLabel_2_1_3_1.setBounds(89, 0, 40, 40);
		snakeBodyLabel_2_1_3_1.setColor(Color.decode("#800000"));
		panel_1_2_1.add(snakeBodyLabel_2_1_3_1);
		
		SnakeBodyLabel snakeBodyLabel_1_1_1_3_1 = new SnakeBodyLabel(40);
		snakeBodyLabel_1_1_1_3_1.setBounds(132, 0, 40, 40);
		snakeBodyLabel_1_1_1_3_1.setColor(Color.decode("#800000"));	
		panel_1_2_1.add(snakeBodyLabel_1_1_1_3_1);
		
		JPanel panel_2_1_2 = new JPanel();
		panel_2_1_2.setLayout(null);
		panel_2_1_2.setBounds(615, 674, 172, 40);
		add(panel_2_1_2);
		
		SnakeBodyLabel snakeBodyLabel_4_2_2 = new SnakeBodyLabel(40);
		snakeBodyLabel_4_2_2.setBounds(0, 0, 40, 40);
		snakeBodyLabel_4_2_2.setColor(Color.decode("#FF4500"));
		panel_2_1_2.add(snakeBodyLabel_4_2_2);
		
		SnakeBodyLabel snakeBodyLabel_1_3_2_2 = new SnakeBodyLabel(40);
		snakeBodyLabel_1_3_2_2.setBounds(45, 0, 40, 40);
		snakeBodyLabel_1_3_2_2.setColor(Color.decode("#FF4500"));
		panel_2_1_2.add(snakeBodyLabel_1_3_2_2);
		
		SnakeBodyLabel snakeBodyLabel_2_2_2_2 = new SnakeBodyLabel(40);
		snakeBodyLabel_2_2_2_2.setBounds(89, 0, 40, 40);
		snakeBodyLabel_2_2_2_2.setColor(Color.decode("#FF4500"));
		panel_2_1_2.add(snakeBodyLabel_2_2_2_2);
		
		SnakeBodyLabel snakeBodyLabel_1_1_2_2_2 = new SnakeBodyLabel(40);
		snakeBodyLabel_1_1_2_2_2.setBounds(132, 0, 40, 40);
		snakeBodyLabel_1_1_2_2_2.setColor(Color.decode("#FF4500"));
		panel_2_1_2.add(snakeBodyLabel_1_1_2_2_2);
		
		JPanel panel_1_1_1_2 = new JPanel();
		panel_1_1_1_2.setLayout(null);
		panel_1_1_1_2.setBounds(615, 759, 172, 40);
		add(panel_1_1_1_2);
		
		SnakeBodyLabel snakeBodyLabel_3_2_1_2 = new SnakeBodyLabel(40);
		snakeBodyLabel_3_2_1_2.setBounds(0, 0, 40, 40);
		snakeBodyLabel_3_2_1_2.setColor(Color.decode("#808000"));
		panel_1_1_1_2.add(snakeBodyLabel_3_2_1_2);
		
		SnakeBodyLabel snakeBodyLabel_1_2_2_1_2 = new SnakeBodyLabel(40);
		snakeBodyLabel_1_2_2_1_2.setBounds(45, 0, 40, 40);
		snakeBodyLabel_1_2_2_1_2.setColor(Color.decode("#808000"));
		panel_1_1_1_2.add(snakeBodyLabel_1_2_2_1_2);
		
		SnakeBodyLabel snakeBodyLabel_2_1_2_1_2 = new SnakeBodyLabel(40);
		snakeBodyLabel_2_1_2_1_2.setBounds(89, 0, 40, 40);
		snakeBodyLabel_2_1_2_1_2.setColor(Color.decode("#808000"));
		panel_1_1_1_2.add(snakeBodyLabel_2_1_2_1_2);
		
		SnakeBodyLabel snakeBodyLabel_1_1_1_2_1_2 = new SnakeBodyLabel(40);
		snakeBodyLabel_1_1_1_2_1_2.setBounds(132, 0, 40, 40);
		snakeBodyLabel_1_1_1_2_1_2.setColor(Color.decode("#808000"));
		panel_1_1_1_2.add(snakeBodyLabel_1_1_1_2_1_2);
	}
	
	private void setOpaqueFalseForAllPanels(JPanel containerPanel) {
		ArrayList<JPanel> panelList = getAllPanels(containerPanel);
		for (JPanel panel : panelList) {
			panel.setOpaque(false);
		}
	}

	private ArrayList<JPanel> getAllPanels(Container container) {
		ArrayList<JPanel> panelList = new ArrayList<>();
		Component[] components = container.getComponents();
		for (Component component : components) {
			if (component instanceof JPanel) {
				panelList.add((JPanel) component);
				panelList.addAll(getAllPanels((JPanel) component));
			}
		}
		return panelList;
	}
	
	
	public void setFontForAllLabels(JPanel containerPanel, Font font) {
		ArrayList<JLabel> labelList = getAllLabels(containerPanel);
		for (JLabel label : labelList) {
			label.setFont(font);
		}
	}

	private ArrayList<JLabel> getAllLabels(Container container) {
		ArrayList<JLabel> labelList = new ArrayList<>();
		Component[] components = container.getComponents();
		for (Component component : components) {
			if (component instanceof JLabel) {
				labelList.add((JLabel) component);
			} else if (component instanceof JPanel) {
				labelList.addAll(getAllLabels((JPanel) component));
			}
		}
		return labelList;
	}
	
	private void setColorForAllLabels(JPanel containerPanel, Color color) {
		ArrayList<JLabel> labelList = getAllLabels(containerPanel);
		for (JLabel label : labelList) {
			label.setForeground(color);
		}
	}
}
