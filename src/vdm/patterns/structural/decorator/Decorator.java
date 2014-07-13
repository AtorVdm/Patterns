package vdm.patterns.structural.decorator;

import vdm.patterns.helpers.Pattern;

public abstract class Decorator implements Component, Pattern {
	protected Component component;
	
	public Decorator(Component component) {
		this.component = component;
	}
	
	@Override
	public void print() {
		component.print();
	}
	
	public void newFunction() {
		DecoratorClient.addOutput("==========");
	}
}