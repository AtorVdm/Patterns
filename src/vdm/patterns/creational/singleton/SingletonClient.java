package vdm.patterns.creational.singleton;

public class SingletonClient extends vdm.patterns.helpers.Client {
	public void main() {
		Singleton sin = Singleton.getInstance();
	    
		String output = "";
		
	    sin.setData("1");
	    output += ("\nData: " + sin.getData());
	    
	    dataChanger1();
	    output += ("\nData: " + sin.getData());
	    
	    dataChanger2();
	    output += ("\nData: " + sin.getData());
	    
	    super.main(output, sin);
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