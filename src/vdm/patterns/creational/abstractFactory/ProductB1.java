package vdm.patterns.creational.abstractFactory;

public class ProductB1 extends AbstractProductB {
	public ProductB1(String arg) {
		AbstractFactoryClient.addOutput("\nData: initialized ProductB1 with arg:" + arg);
	}

	@Override
	public void operationB1() {
		AbstractFactoryClient.addOutput("\nData: called operationB1 from ProductB1");
	}

	@Override
	public void operationB2() {
		AbstractFactoryClient.addOutput("\nData: called operationB2 from ProductB1");
	}
}