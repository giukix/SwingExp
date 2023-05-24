package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

import view.MainFrame;

public class AppManager implements ActionListener {
	
	private MainFrame mainFrame;

	public AppManager(MainFrame mainFrame) {
		super();
		this.mainFrame = mainFrame;
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		String text = "Unknown Object";
		if(e.getSource() == mainFrame.getMyButton())
			text = "Event raised from MyButton";
		
		JDialog dialog = new JDialog();
		dialog.setTitle("Example Dialog");
		dialog.setBounds(100, 50, 400, 200);
		dialog.add(new JLabel(text));
	
		dialog.show();
	}
	
}
