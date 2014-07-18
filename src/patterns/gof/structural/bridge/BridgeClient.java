package patterns.gof.structural.bridge;

import patterns.gof.helpers.Client;

public class BridgeClient extends Client {
	public void main() {
		cleanOutput();
		
		(new Rectangle(new RedColor())).colorIt();
		(new Circle(new BlueColor())).colorIt();
			
		super.main("Bridge");
	}
}