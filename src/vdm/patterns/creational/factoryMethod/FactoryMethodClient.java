package vdm.patterns.creational.factoryMethod;

import vdm.patterns.helpers.Client;

public class FactoryMethodClient extends Client {
	public void main() {
		Creator[] creators = {new ConcreteCreatorA(), new ConcreteCreatorB()};

		String output = "";
		for (Creator creator : creators) {
	    	Product product = creator.factoryMethod();
	    	output += "\nData: " + product.getClass().getSimpleName();
	    }
		
		super.main(output, "Factory Method");
	}
}