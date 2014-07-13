package vdm.patterns.structural.facade;

import vdm.patterns.helpers.Client;

public class FacadeClient extends Client {
	public void main() {
		output = "";
		(new Facade()).startComputer();
		super.main("Facade");
	}
}