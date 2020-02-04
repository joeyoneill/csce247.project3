package csce247project3;

public class Lights extends TreeDecorator {

	public ChristmasTree tree;
	
	// Decorator constructor
	public Lights(ChristmasTree tree) {
		this.tree = tree;
	}
	
	// Adds to tree description
	public String toString() {
		return tree.toString() + " + strings of lights";
	}
	
	// Adds and returns tree price with Lights
	public double getCost() {
		return tree.getCost() + 2.0;
	}
	
}
