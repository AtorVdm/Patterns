package vdm.patterns.creational.abstractFactory;

import vdm.patterns.helpers.Client;

public class AbstractFactoryClient extends Client {
	private static String output = "";
	
	public void main() {
		output = "";
		AbstractFactory af = FactoryMaker.getFactory(1);
		AbstractProductA product = af.createProductA();
		product.operationA2();
		super.main(output, "Abstract Factory");
	}
	
	public static void addOutput(String out) {
		output += out;
	}
}