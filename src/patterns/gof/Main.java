package patterns.gof;

import patterns.gof.behavioral.chainOfResponsibility.ChainOfResponsibilityClient;
import patterns.gof.behavioral.command.CommandClient;
import patterns.gof.behavioral.interpreter.InterpreterClient;
import patterns.gof.creational.abstractFactory.AbstractFactoryClient;
import patterns.gof.creational.builder.BuilderClient;
import patterns.gof.creational.factoryMethod.FactoryMethodClient;
import patterns.gof.creational.prototype.PrototypeClient;
import patterns.gof.creational.singleton.SingletonClient;
import patterns.gof.structural.adapter.AdapterClient;
import patterns.gof.structural.bridge.BridgeClient;
import patterns.gof.structural.composite.CompositeClient;
import patterns.gof.structural.decorator.DecoratorClient;
import patterns.gof.structural.facade.FacadeClient;
import patterns.gof.structural.flyweight.FlyweightClient;
import patterns.gof.structural.proxy.ProxyClient;

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
		(new CommandClient()).main();
		(new InterpreterClient()).main();
	}
	
	public static void testingOutput(String testingCase) {
		System.out.println("          /\\/\\/\\/\\/\\/\\/\\/\\/\\/\\");
		System.out.println("               " + testingCase);
		System.out.println("          \\/\\/\\/\\/\\/\\/\\/\\/\\/\\/");
		System.out.print("----------------------------------------\n");
	}
}