package vdm.patterns.creational.builder;

import vdm.patterns.helpers.Client;

public class BuilderClient extends Client {
	private static String output = "";
	
	public void main() {
		output = "";
		
		try {
			Cook cookJohn = new Cook();
			output += "\nData: cook John is going to prepare some pies for you today!";
			
			PieBuilder cpBuilder = new ChocolatePieBuilder();
			PieBuilder apBuilder = new ApplePieBuilder();
			
			cookJohn.constructPieWithPieBuilder(cpBuilder);
			cookJohn.bakePie();
			output += "\nData: cook John has finished baking your pie";
			
			Pie chocoPie = cookJohn.getPie();
			output += "\nData: pie dough: " + chocoPie.getDough();
			output += "\nData: pie filling: " + chocoPie.getFilling(); 
			
			cookJohn.constructPieWithPieBuilder(apBuilder);
			cookJohn.bakePie();
			output += "\nData: cook John has finished baking your pie";
			
			Pie applePie = cookJohn.getPie();
			output += "\nData: pie dough: " + applePie.getDough();
			output += "\nData: pie filling: " + applePie.getFilling();
			
			output += "\nData: cook John is tired. Cook John is going home";
		} catch(Exception ex) {
			output += "/n Data: undefined error: " + ex.getMessage();
		}
		
		super.main(output, "Builder");
	}
	
	public static void addOutput(String out) {
		output += out;
	}
}