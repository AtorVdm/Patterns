package vdm.patterns.structural.composite;

public class Circle implements GraphicalElement {
	@Override
	public void draw() {
		CompositeClient.addOutput("circle drawn");
	}
}