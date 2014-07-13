package vdm.patterns.structural.composite;

public class Line implements GraphicalElement {
	@Override
	public void draw() {
		CompositeClient.addOutput("line drawn");
	}
}