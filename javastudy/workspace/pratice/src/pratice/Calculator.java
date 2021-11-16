package pratice;

public class Calculator {

	private static Calculator calc;
	
	
	private Calculator () {
		
		
	}
	
	public static Calculator getCalc() {
		
		
		if ( calc ==  null ) {
			
			calc = new Calculator();
		}
		
		return calc;
	}
	
	
}
