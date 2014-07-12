package vdm.patterns.helpers;

public class Client {
	public void main(String output, Pattern object) {
		printAll(output, object.getClass().getSimpleName());
	}
	
	public void main(String output, String object) {
		printAll(output, object);
	}
	
	private void printAll(String output, String className) {
		System.out.print("Testing pattern: " + className + ":");
		
		System.out.print(output);
		
	    printSplitter();
	}

	private void printSplitter() {
	    System.out.print("\n----------------------------------------\n");
	}
}