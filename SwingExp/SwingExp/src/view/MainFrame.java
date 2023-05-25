package view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

import controller.AppManager;

public class MainFrame extends JFrame {

	private AppManager appManager;
	
	private JButton textViewButton;
	private JButton addTextButton;

	public MainFrame() {
		super("Java Swing MVC");	

		setLayout(new FlowLayout());
			
		int FRAME_WIDTH = 600;
		int FRAME_HEIGHT = 300;
		// size of our application frame
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textViewButton = new JButton("View text");
//		myButton.setBackground(Color.blue);		
		add(textViewButton);
		
		addTextButton = new JButton("Add Text");
//		modifiyButton.setBackground(Color.red);		
		add(addTextButton);
		
		appManager = new AppManager(this);
		textViewButton.addActionListener(appManager);
		addTextButton.addActionListener(appManager);
		
//		pack();
		setVisible(true);
	}

	public JButton getMyButton() {
		return textViewButton;
	}

	public JButton getAddTextButton() {
		return addTextButton;
	}

	
}
