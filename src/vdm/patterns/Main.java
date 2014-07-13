package vdm.patterns;

import vdm.patterns.creational.abstractFactory.AbstractFactoryClient;
import vdm.patterns.creational.builder.BuilderClient;
import vdm.patterns.creational.factoryMethod.FactoryMethodClient;
import vdm.patterns.creational.prototype.PrototypeClient;
import vdm.patterns.creational.singleton.SingletonClient;
import vdm.patterns.structural.adapter.AdapterClient;

public class Main {
	public static void main(String[] args) {
		testingOutput("CREATIONAL");
		(new SingletonClient()).main();
		(new FactoryMethodClient()).main();
		(new PrototypeClient()).main();
		(new AbstractFactoryClient()).main();
		(new BuilderClient()).main();
		testingOutput("STRUCTURAL");
		(new AdapterClient()).main();
	}
	
	public static void testingOutput(String testingCase) {
		System.out.println("/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\");
		System.out.println(testingCase);
		System.out.println("\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/");
	}
}