package practice;

public class MainClass {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		
		try {
		System.out.println(calc.plus(1, 1));
		System.out.println(calc.plus(1.5, 5));
		System.out.println(calc.plus("1" , "1"));
		System.out.println(calc.plus("1.5", "1.2"));
		}catch(Exception e) {
			System.out.println("예외발생");
		}
	}

}
