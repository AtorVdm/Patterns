package vdm.patterns.structural.decorator;

public class InitialClass implements Component {
	public void print() {
		DecoratorClient.addOutput("message from initial class");
	}
}
