package csce247project3;

public abstract class ChristmasTree {
	
	protected String description;
	
	// Returns decription of tree
	public String toString() {
		return description;
	}
	
	public abstract double getCost();

}
