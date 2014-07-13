package vdm.patterns.creational.singleton;

public class SingletonClient extends vdm.patterns.helpers.Client {
	public void main() {
		output = "";
		
		Singleton sin = Singleton.getInstance();
		
	    sin.setData("1");
	    output += sin.getData();
	    
	    dataChanger1();
	    output += sin.getData();
	    
	    dataChanger2();
	    output += sin.getData();
	    
	    super.main("Singleton");
	}

	private void dataChanger1() {
	    Singleton sin = Singleton.getInstance();
	    sin.setData(sin.getData() + "2");
	}

	private void dataChanger2() {
		Singleton sin = Singleton.getInstance();
	    sin.setData(sin.getData() + "3");
	}
}