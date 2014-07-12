package vdm.patterns.creational.prototype;

import vdm.patterns.helpers.Client;

public class PrototypeClient extends Client {
	public void main() {
		ConcretePrototype cp1 = new ConcretePrototype();
	    cp1.setA(5);
	    cp1.setB(-1);
	    
	    // using prototype to create new object
	    ConcretePrototype cp2 = (ConcretePrototype) cp1.clone();
	    // creating new prototype from existing one
	    cp2.setA(cp1.getA() + 79);
	    cp2.setB(cp1.getB() + 92);
	    
	    ConcretePrototype cp3 = (ConcretePrototype) cp2.clone();
	    
	    String output = "";
	    
	    output += "\nData: " + cp1.getA() + ", " + cp1.getB();
	    output += "\nData: " + cp3.getA() + ", " + cp3.getB();
	    
	    super.main(output, "Prototype");
	}
}