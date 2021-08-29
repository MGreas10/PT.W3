package Assignments;

public class AsteriskLogger implements Logger{

	@Override
	public void log(String L) {
		System.out.println("***" + L + "***");
		
	}

	@Override
	public void error(String E) {
		
		System.out.println("******************" + 
		"\n" + "***ERROR: "+ E + "***"+ "\n" + "******************");
		
	}

}
