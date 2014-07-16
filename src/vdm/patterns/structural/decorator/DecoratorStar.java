package vdm.patterns.structural.decorator;

public class DecoratorStar extends Decorator {
	public DecoratorStar(Component component) {
		super(component);
	}
	
	@Override
	public void print() {
		DecoratorClient.addOutput("**********");
		super.print();
	}
}