
public class Main {
	
	
	// Main Method
	public static void main(String[] args) {
		
		System.out.println("Hello, this is the initial commit");
		System.out.println("Hello, this is the second commit");
		System.out.println("Hello, this is the third commit");
		
		String[] currentInfo = {"car","pig","frog"};
		data storedInfo = new data(currentInfo);
		
		System.out.println("Current Info is " + storedInfo.getData(2));
	}
	
}