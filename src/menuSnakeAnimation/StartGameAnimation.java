package menuSnakeAnimation;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.BorderLayout;
import panels.CampoPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartGameAnimation extends JPanel implements Animation{

	private static final long serialVersionUID = 1L;
	private Timer t;
	/**
	 * Create the panel.
	 */
	public StartGameAnimation() {
		setSize(892,764);
		setLayout(null);
		

	}

	@Override
	public void startAnimation() {
		CampoPanel campoPanel = new CampoPanel();
		add(campoPanel, BorderLayout.CENTER);
		
		JLabel text = new JLabel("3");
		text.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 600));
		text.setBounds(305, 160, 786, 468);
		campoPanel.add(text);
		
		new Thread(()->{
			audio("res/sounds/startSound.wav");
		}).start();;
		
		t = new Timer(1000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				switch(text.getText()) {
					
					case "3":
						text.setText("2");
						break;
				
					case "2":
						text.setText("1");
						break;
					
					case "1":
						text.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 500));
						text.setBounds(100, 166, 786, 468);
						text.setText("GO");
						break;
					
				}
				
			}
			
		});
		t.start();
	}

	@Override
	public void stopAnimation() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
