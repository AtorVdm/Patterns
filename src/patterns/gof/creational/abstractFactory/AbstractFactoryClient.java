package patterns.gof.creational.abstractFactory;

import patterns.gof.helpers.Client;

public class AbstractFactoryClient extends Client {
	public void main() {
		output = "";
		
		AbstractFactory af = FactoryMaker.getFactory(1);
		AbstractProductA product = af.createProductA();
		product.operationA2();
		super.main("Abstract Factory");
	}
}