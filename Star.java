package csce247project3;

public class Star extends TreeDecorator {
	
	public ChristmasTree tree;
	
	// Decorator constructor
	public Star(ChristmasTree tree) {
		this.tree = tree;
	}
	
	// Adds to tree description
	public String toString() {
		return tree.toString() + " + a star on top";
	}
	
	// Adds and returns price with Star
	public double getCost() {
		return tree.getCost() + 6.0;
	}
	
}
