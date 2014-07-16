package vdm.patterns.structural.bridge;

public class Circle extends Shape {
	public Circle(Color color) { 
		super(color);  
	}  

	@Override
	public void colorIt() {
		BridgeClient.addOutput("circle filled with " + color.fillColor() + " color");
	}
}
