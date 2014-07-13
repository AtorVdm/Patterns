package vdm.patterns.structural.adapter;

public class Adapter extends FridgeMicrowave implements OldMachine {
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