package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import panels.CampoPanel;
import panels.MenuPanel;

import java.awt.Color;
import java.awt.BorderLayout;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					SwingUtilities.updateComponentTreeUI(window.frame);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		
		frame.setBounds(600, 100, 920, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		CampoPanel campoPanel = new CampoPanel();
		frame.getContentPane().add(campoPanel, BorderLayout.CENTER);
		campoPanel.setLayout(new BorderLayout(0, 0));
		
		MenuPanel menuPanel = new MenuPanel();
		campoPanel.add(menuPanel, BorderLayout.CENTER);
		
	}
}
