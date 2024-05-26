package menuSnakeAnimation;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class ColorsAnimation {

	public ColorsAnimation() {

	}

	public void moveSnake(JPanel panel) {
		ArrayList<JLabel> labels = getLabelsFromPanel(panel);
		new Timer(30, new ActionListener() {

			private int[] x = { labels.get(0).getX(), labels.get(1).getX(), labels.get(2).getX(),
					labels.get(3).getX() };
			private int[] x2 = { labels.get(0).getX(), labels.get(1).getX(), labels.get(2).getX(),
					labels.get(3).getX() };
			private int xPanel = panel.getX();
			private int xPanel2 = panel.getX();

			@Override
			public void actionPerformed(ActionEvent e) {

				if (xPanel < 259) {


					xPanel += 10;
					panel.setLocation(xPanel, panel.getY());

				} else {
					for(int i = 0;i < x.length;i++) {
						x[i] += 10;
						labels.get(i).setLocation(x[i], labels.get(i).getY());
						System.out.println(x[i]);
					}
					
					for(int i = 0; i < x.length;i++) {
						if(x[i] > 302) {
							xPanel = xPanel2;
							for(int y = 0; y < x2.length;y++) {
								x[y] = x2[y];
								labels.get(y).setVisible(false);
								labels.get(y).setLocation(x[y], labels.get(y).getY());
							}
							break;
						}
					}
					
				}

			}
		}).start();
	}

	public ArrayList<JLabel> getLabelsFromPanel(JPanel panel) {
		ArrayList<JLabel> labels = new ArrayList<>();
		Component[] components = panel.getComponents();
		for (Component component : components) {
			if (component instanceof JLabel) {
				labels.add((JLabel) component);
			}
			if (component instanceof JPanel) {
				labels.addAll(getLabelsFromPanel((JPanel) component));
			}
		}
		return labels;
	}

}
