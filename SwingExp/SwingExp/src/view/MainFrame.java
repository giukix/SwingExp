package view;

import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import controller.AppManager;

public class MainFrame extends JFrame {

	private AppManager appManager;
	
	// Card layout for switching view
	private CardLayout cardLayout;
	private JButton myButton;

	public MainFrame() {
		super("Java Swing MVC");
		
		

		cardLayout = new CardLayout();
		// sets our layout as a card layout
		setLayout(cardLayout);
		
		myButton = new JButton("My button");
		
		add(myButton);

		int FRAME_WIDTH = 600;
		int FRAME_HEIGHT = 300;
		// size of our application frame
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		appManager = new AppManager(this);
		myButton.addActionListener(appManager);
		setVisible(true);
	}

	public JButton getMyButton() {
		return myButton;
	}

	
}
