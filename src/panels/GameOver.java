package panels;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GameOver extends JPanel {

	private static final long serialVersionUID = 1L;
	private Gaming game;
	private MenuPanel menu;
	/**
	 * Create the panel.
	 */
	public GameOver(Gaming game, MenuPanel menu) {
		this.game = game;
		this.menu = menu;
		
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
		lblOver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				game.setVisible(false);
				menu.getCampoPanel().setVisible(true);
				menu.setVisible(true);
				menu.getParent().repaint();
				menu.getParent().revalidate();
				setVisible(false);
			}
		});
		lblOver.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 200));
		lblOver.setBounds(149, 332, 645, 283);
		add(lblOver);

	}
	
}
