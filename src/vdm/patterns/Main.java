package vdm.patterns;

import vdm.patterns.creational.abstractFactory.AbstractFactoryClient;
import vdm.patterns.creational.builder.BuilderClient;
import vdm.patterns.creational.factoryMethod.FactoryMethodClient;
import vdm.patterns.creational.prototype.PrototypeClient;
import vdm.patterns.creational.singleton.SingletonClient;

public class Main {
	public static void main(String[] args) {
		(new SingletonClient()).main();
		(new FactoryMethodClient()).main();
		(new PrototypeClient()).main();
		(new AbstractFactoryClient()).main();
		(new BuilderClient()).main();
	}
}