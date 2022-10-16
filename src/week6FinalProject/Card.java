package week6FinalProject;

public class Card {
	private int value;
	private String name;
	
	//not entirely sure this is needed but it works with it in so yay
	public Card (int value, String name) {
		this.value = value;
		this.name = name;
	}
	//turns out I did end up needing it 
	public  Card() {
		
	}
	
	
	//Getters and setters here
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//prints card name and value to console
	public void describe () {
		System.out.println(this.name + " value:" + this.value);
			}

}
