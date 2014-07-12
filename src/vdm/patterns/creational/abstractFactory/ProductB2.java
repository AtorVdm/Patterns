package vdm.patterns.creational.abstractFactory;

public class ProductB2 extends AbstractProductB {
	public ProductB2(String arg) {
		AbstractFactoryClient.addOutput("\nData: initialized ProductB2 with arg:" + arg);
	}

	@Override
	public void operationB1() {
		AbstractFactoryClient.addOutput("\nData: called operationB1 from ProductB2");
	}

	@Override
	public void operationB2() {
		AbstractFactoryClient.addOutput("\nData: called operationB2 from ProductB2");
	}
}
