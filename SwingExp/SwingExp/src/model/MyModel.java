package model;

public class MyModel {
	
	private String myText;

	public MyModel(String myText) {
		this.myText = myText;
	}

	public String getMyText() {
		return myText;
	}

	public void setMyText(String myText) {
		this.myText = myText;
	}
	
	public void addText(String textToAdd) {		
		myText += (myText.length() > 0 ? " + " : "") +  textToAdd;
	}
	
}
