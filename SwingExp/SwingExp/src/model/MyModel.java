package model;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class MyModel extends Observable {
	
	private String myText;
	private int numberOfInteractions;	

	public MyModel(String myText) {
		this.myText = myText;
		numberOfInteractions = 0;
	}

	public String getMyText() {
		return myText;
	}

	public void setMyText(String myText) {
		this.myText = myText;
		numberOfInteractions++;
		setChanged();
		notifyObservers();
	}
	
	public void addText(String textToAdd) {		
		myText += (myText.length() > 0 ? " + " : "") + textToAdd;
		numberOfInteractions++;
		setChanged();
		notifyObservers();
	}
	
	public int getNumberOfInteractions() {
		return numberOfInteractions;
	}
					
}
