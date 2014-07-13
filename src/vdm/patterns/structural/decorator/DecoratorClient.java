package vdm.patterns.structural.decorator;

import vdm.patterns.helpers.Client;

public class DecoratorClient extends Client {
	public void main() {
		output = "";
		// initial class is decorated in 2 decorators
		Decorator d = new DecoratorLine(new DecoratorStar(new InitialClass()));
		d.print();
		d.newFunction();
		super.main("Decorator");
	}
}