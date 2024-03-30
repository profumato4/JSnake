package panels;

import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Font;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PausePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton resume;
	
	/**
	 * Create the panel.
	 */
	public PausePanel(Timer t, ResumeButtonListener listener) {
		setSize(920, 850);
		setOpaque(false);
		setLayout(null);
		
		resume = new JButton("Resume");
		resume.setOpaque(false);
		resume.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.start();
				setVisible(false);
				
				if (listener != null) {
                    listener.onResumeClicked((byte) 0); 
                }
				
			}
		});
		resume.setFocusable(false);
		resume.setFocusTraversalKeysEnabled(false);
		resume.setFocusPainted(false);
		resume.setBorderPainted(false);
		resume.setBounds(10, 0, 900, 188);
		resume.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 200));
		add(resume);
		
		JButton home = new JButton("Back To Home");
		home.setOpaque(false);
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		home.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 130));
		home.setFocusable(false);
		home.setFocusTraversalKeysEnabled(false);
		home.setFocusPainted(false);
		home.setBorderPainted(false);
		home.setBounds(10, 529, 900, 213);
		add(home);
		
		JButton restart = new JButton("Restart");
		restart.setOpaque(false);
		restart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		restart.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 200));
		restart.setFocusable(false);
		restart.setFocusTraversalKeysEnabled(false);
		restart.setFocusPainted(false);
		restart.setBorderPainted(false);
		restart.setBounds(10, 265, 900, 188);
		add(restart);
	}
	
	public JButton getResumeButton() {
		return resume;
	}
	
}
