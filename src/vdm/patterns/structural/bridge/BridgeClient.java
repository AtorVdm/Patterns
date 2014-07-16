package vdm.patterns.structural.bridge;

import vdm.patterns.helpers.Client;

public class BridgeClient extends Client {
	public void main() {
		output = "";
		
		(new Rectangle(new RedColor())).colorIt();
		(new Circle(new BlueColor())).colorIt();
			
		super.main("Bridge");
	}
}
