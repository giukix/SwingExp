package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

import model.MyModel;
import view.MainFrame;

public class AppManager implements ActionListener {
	
	private MainFrame mainFrame;
	private MyModel myModel;

	public AppManager(MainFrame mainFrame) {
		super();
		this.mainFrame = mainFrame;
		myModel = new MyModel("Initial Model Text");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String text = "Unknown Object";
		if(e.getSource() == mainFrame.getMyButton()) {
			text = myModel.getMyText();
		}
		else if(e.getSource() == mainFrame.getAddTextButton()) {
			myModel.addText("other text");
			text = myModel.getMyText();
		}
		
		JDialog dialog = new JDialog();
		dialog.setTitle("Example Dialog");
		dialog.setBounds(100, 50, 400, 200);
		dialog.add(new JLabel(text));
	
		dialog.show();
	}
	
}
