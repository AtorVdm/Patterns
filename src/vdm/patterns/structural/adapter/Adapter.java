package vdm.patterns.structural.adapter;

import vdm.patterns.helpers.Pattern;

public class Adapter extends FridgeMicrowave implements OldMachine, Pattern {
	@Override
	public void launch() {
		startWarmingCell1();
		startChillingCell2();
	}

	@Override
	public void stop() {
		stopWarmingCell1();
		stopChillingCell2();
	}
}