package panels;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class GameOver extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public GameOver() {
		setOpaque(false);
		setSize(1105, 751);
		setLayout(null);

		setUp();
		
		setFocusable(false);
		
	}
	
	private void setUp() {
		JLabel lblNewLabel = new JLabel("GAME \r\n");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 200));
		lblNewLabel.setBounds(139, 105, 688, 271);
		add(lblNewLabel);
		
		JLabel lblOver = new JLabel("OVER");
		lblOver.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 200));
		lblOver.setBounds(149, 332, 645, 283);
		add(lblOver);

	}
	
}
