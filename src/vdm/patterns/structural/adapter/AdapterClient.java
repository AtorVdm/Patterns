package vdm.patterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

import vdm.patterns.helpers.Client;

public class AdapterClient extends Client {
	public void main() {
		output = "";
		
		List<OldMachine> machines = new ArrayList<OldMachine>();
		machines.add(new CoffeeMachine());
		machines.add(new Microwave());
		machines.add(new Adapter());
		
		for (OldMachine machine : machines) {
			machine.launch();
		}
		
		addOutput("all machines are working");
		
		for (OldMachine machine : machines) {
			machine.stop();
		}
		
		addOutput("all machines were stopped");
		
		super.main("Adapter");
	}
}