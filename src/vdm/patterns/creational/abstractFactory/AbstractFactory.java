package vdm.patterns.creational.abstractFactory;

import vdm.patterns.helpers.Pattern;

public abstract class AbstractFactory implements Pattern {
	public abstract AbstractProductA createProductA();
	public abstract AbstractProductB createProductB();
}