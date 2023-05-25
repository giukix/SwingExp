package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class MyModel extends Observable {
	
	private String myText;
	private int numberOfInteractions;	
	private List<Observer> observers;

	public MyModel(String myText) {
		this.myText = myText;
		numberOfInteractions = 0;
		observers = new ArrayList<>();
	}

	public String getMyText() {
		return myText;
	}

	public void setMyText(String myText) {
		this.myText = myText;
		numberOfInteractions++;
		notifyObservers();
	}
	
	public void addText(String textToAdd) {		
		myText += (myText.length() > 0 ? " + " : "") + textToAdd;
		numberOfInteractions++;
		notifyObservers();
	}
	
	@Override
	public synchronized void addObserver(Observer o) {
		observers.add(o);		
	}

	@Override
	public void notifyObservers() {
		for(Observer o : observers)
			o.update(null, o);
	}

	public int getNumberOfInteractions() {
		return numberOfInteractions;
	}
					
}
