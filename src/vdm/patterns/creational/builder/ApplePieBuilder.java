package vdm.patterns.creational.builder;

public class ApplePieBuilder extends PieBuilder {
	@Override
	protected void buildDough() {
		this.pie.setDough("150g of sugar + 200g of butter + 5 eggs +"
				+ " 8g of baking powder + 650g of flour");
	}

	@Override
	protected void buildFilling() {
		this.pie.setFilling("apple slices");
	}
}