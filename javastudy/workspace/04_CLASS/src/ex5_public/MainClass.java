package ex5_public;

public class MainClass {

	public static void main(String[] args) {
	
		Calculator calc = new Calculator();

		
		System.out.println(calc.addition(7, 2));
		System.out.println(calc.Subtraction(8, 2));
		System.out.println(calc.mutiplication(9, 6));
		System.out.println(calc.division(14, 2));
	
	    System.out.println( calc.power(2, 10) );  // 1024 ( 2의 10제곱)
	
	}

}
