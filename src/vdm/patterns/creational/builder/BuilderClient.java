package vdm.patterns.creational.builder;

import vdm.patterns.helpers.Client;

public class BuilderClient extends Client {
	public void main() {
		output = "";
		
		try {
			Cook cookJohn = new Cook();
			addOutput("cook John is going to prepare some pies for you today!");
			
			PieBuilder cpBuilder = new ChocolatePieBuilder();
			PieBuilder apBuilder = new ApplePieBuilder();
			
			cookJohn.constructPieWithPieBuilder(cpBuilder);
			cookJohn.bakePie();
			addOutput("cook John has finished baking your pie");
			
			Pie chocoPie = cookJohn.getPie();
			addOutput("pie dough: " + chocoPie.getDough());
			addOutput("pie filling: " + chocoPie.getFilling()); 
			
			cookJohn.constructPieWithPieBuilder(apBuilder);
			cookJohn.bakePie();
			addOutput("cook John has finished baking your pie");
			
			Pie applePie = cookJohn.getPie();
			addOutput("pie dough: " + applePie.getDough());
			addOutput("pie filling: " + applePie.getFilling());
			
			addOutput("cook John is tired. Cook John is going home");
		} catch(Exception ex) {
			addOutput("undefined error: " + ex.getMessage());
		}
		
		super.main("Builder");
	}
}