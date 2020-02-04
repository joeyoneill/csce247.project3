package csce247project3;

public class Tinsel extends TreeDecorator {
	
	public ChristmasTree tree;
	
	// Decorator constructor
	public Tinsel(ChristmasTree tree) {
		this.tree = tree;
	}
	
	// Adds to tree description
	public String toString() {
		return tree.toString() + " + tinsel all around";
	}
	
	// Adds and returns tree price with Tinsel
	public double getCost() {
		return tree.getCost() + 2.0;
	}
	
}
