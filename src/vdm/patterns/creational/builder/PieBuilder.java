package vdm.patterns.creational.builder;

public abstract class PieBuilder {
	protected Pie pie;
	
	private boolean baked;
	
	protected abstract void buildDough();
	protected abstract void buildFilling();
	
	
	public void createNewPie() {
		pie = new Pie();
		baked = false;
	}
	
	public void bake() {
		if(pie.getDough().isEmpty()) {
			// no dough!
			return;
		}
		if (pie.getFilling().isEmpty()) {
			// no filling!
			return;
		}
		baked = true;
		// out: baked
	}

	public Pie getPie() {
		return pie;
	}

	public void setPie(Pie pie) {
		this.pie = pie;
	}
	
	public boolean isBaked() {
		return baked;
	}
}