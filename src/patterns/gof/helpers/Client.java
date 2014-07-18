package patterns.gof.helpers;

public class Client {
	protected static String output = "";

	public void main(String object) {
		printAll(object);
	}
	
	private void printAll(String className) {
		System.out.print("Testing pattern: " + className);
		
		System.out.print(output);
		
	    printSplitter();
	}

	private void printSplitter() {
	    System.out.print("\n----------------------------------------\n");
	}
	
	public static void addOutput(String out) {
		output += "\nData: " + out;
	}
}