package vdm.patterns.structural.flyweight;

public abstract class EnglishCharacter {
	protected char simbol;
	 
	protected int width;
 
	protected int height;
 
	public void printCharacter() {
		FlyweightClient.addOutput(simbol + " " + width + " " + height);
	}
}