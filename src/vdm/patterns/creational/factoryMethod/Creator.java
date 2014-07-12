package vdm.patterns.creational.factoryMethod;

import vdm.patterns.helpers.Pattern;

public abstract class Creator implements Pattern {
	public abstract Product factoryMethod();
}