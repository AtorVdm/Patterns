package vdm.patterns.creational.prototype;

import vdm.patterns.helpers.Pattern;

public abstract class Prototype implements Pattern {
	public abstract Prototype clone();
}