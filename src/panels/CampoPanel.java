package panels;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.JLabel;

public class CampoPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel line1;
	private JLabel line2;
	private JLabel line3;
	private JLabel line4;

	/**
	 * Create the panel.
	 */
	public CampoPanel() {
		setBackground(new Color(46, 139, 87));
		setLayout(null);
		setSize(920,850);

		line1 = new JLabel("");
		line1.setBackground(new Color(0, 0, 0));
		line1.setOpaque(true);
		line1.setBounds(20, 11, 2, 740);
		add(line1);
		
		line3 = new JLabel("");
		line3.setOpaque(true);
		line3.setBackground(Color.BLACK);
		line3.setBounds(880, 11, 2, 740);
		add(line3);
		
		line2 = new JLabel("");
		line2.setOpaque(true);
		line2.setBackground(Color.BLACK);
		line2.setBounds(22, 11, 860, 2);
		add(line2);
		
		line4 = new JLabel("");
		line4.setOpaque(true);
		line4.setBackground(Color.BLACK);
		line4.setBounds(22, 748, 860, 2);
		add(line4);
		

	}
	
	public Rectangle[] getRec() {
		
		Rectangle[] rec = {line1.getBounds(), line2.getBounds(), line3.getBounds(), line4.getBounds()};
		
		return rec;
	}
	
}
