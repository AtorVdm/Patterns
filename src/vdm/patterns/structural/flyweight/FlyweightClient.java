package vdm.patterns.structural.flyweight;

import vdm.patterns.helpers.Client;

public class FlyweightClient extends Client {
	public void main() {
		output = "";
		FlyweightFactory factory = new FlyweightFactory();
		 
		int [] characterCodes = {1,2,3};
		for (int nextCode : characterCodes){
			EnglishCharacter character = factory.getCharacter(nextCode);
			character.printCharacter();
		}
		
		super.main("Flyweight");
	}
}