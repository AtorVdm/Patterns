package vdm.patterns.structural.bridge;

public class Rectangle extends Shape {
	public Rectangle(Color color) { 
		super(color);  
	}  

	@Override
	public void colorIt() {
		BridgeClient.addOutput("rectangle filled with " + color.fillColor() + " color");
	}
}
