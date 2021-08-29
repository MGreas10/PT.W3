package Assignments;

// class that implements Logger and adds spaces between each character of the String argument passed into its methods.

public class SpacedLogger implements Logger {

	@Override
//	
	public void log(String L) {
		char[] characters = L.toCharArray();
		for (char c : characters) {
			System.out.print(c+" ");
	}
			
	}

	@Override
	public void error(String E) {
		char[] error = E.toCharArray();
		System.out.print("\nERROR: ");
		for (char ch : error) {
			System.out.print(ch + " ");
		
	}

  }
}