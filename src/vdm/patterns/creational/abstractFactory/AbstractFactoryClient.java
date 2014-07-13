package vdm.patterns.creational.abstractFactory;

import vdm.patterns.helpers.Client;

public class AbstractFactoryClient extends Client {
	public void main() {
		output = "";
		
		AbstractFactory af = FactoryMaker.getFactory(1);
		AbstractProductA product = af.createProductA();
		product.operationA2();
		super.main("Abstract Factory");
	}
}