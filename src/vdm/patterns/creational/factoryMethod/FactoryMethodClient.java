package vdm.patterns.creational.factoryMethod;

import vdm.patterns.helpers.Client;

public class FactoryMethodClient extends Client {
	public void main() {
		output = "";
		
		Creator[] creators = {new ConcreteCreatorA(), new ConcreteCreatorB()};

		for (Creator creator : creators) {
	    	Product product = creator.factoryMethod();
	    	output += product.getClass().getSimpleName();
	    }
		
		super.main("Factory Method");
	}
}