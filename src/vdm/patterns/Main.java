package vdm.patterns;

import vdm.patterns.behavioral.chainOfResponsibility.ChainOfResponsibilityClient;
import vdm.patterns.creational.abstractFactory.AbstractFactoryClient;
import vdm.patterns.creational.builder.BuilderClient;
import vdm.patterns.creational.factoryMethod.FactoryMethodClient;
import vdm.patterns.creational.prototype.PrototypeClient;
import vdm.patterns.creational.singleton.SingletonClient;
import vdm.patterns.structural.adapter.AdapterClient;
import vdm.patterns.structural.bridge.BridgeClient;
import vdm.patterns.structural.composite.CompositeClient;
import vdm.patterns.structural.decorator.DecoratorClient;
import vdm.patterns.structural.facade.FacadeClient;
import vdm.patterns.structural.flyweight.FlyweightClient;
import vdm.patterns.structural.proxy.ProxyClient;

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
		(new BridgeClient()).main();
		(new CompositeClient()).main();
		(new DecoratorClient()).main();
		(new FacadeClient()).main();
		(new FlyweightClient()).main();
		(new ProxyClient()).main();
		testingOutput("BEHAVIORAL");
		(new ChainOfResponsibilityClient()).main();
	}
	
	public static void testingOutput(String testingCase) {
		System.out.println("          /\\/\\/\\/\\/\\/\\/\\/\\/\\/\\");
		System.out.println("               " + testingCase);
		System.out.println("          \\/\\/\\/\\/\\/\\/\\/\\/\\/\\/");
		System.out.print("----------------------------------------\n");
	}
}