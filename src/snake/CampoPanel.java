package snake;

import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.JLabel;

public class CampoPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public CampoPanel() {
		setBackground(new Color(46, 139, 87));
		setLayout(null);
		setSize(892,764);

		JLabel line1 = new JLabel("");
		line1.setBackground(new Color(0, 0, 0));
		line1.setOpaque(true);
		line1.setBounds(10, 11, 2, 740);
		add(line1);
		
		JLabel line3 = new JLabel("");
		line3.setOpaque(true);
		line3.setBackground(Color.BLACK);
		line3.setBounds(880, 11, 2, 740);
		add(line3);
		
		JLabel line2 = new JLabel("");
		line2.setOpaque(true);
		line2.setBackground(Color.BLACK);
		line2.setBounds(10, 11, 872, 2);
		add(line2);
		
		JLabel line4 = new JLabel("");
		line4.setOpaque(true);
		line4.setBackground(Color.BLACK);
		line4.setBounds(10, 749, 872, 2);
		add(line4);
		

	}
}
