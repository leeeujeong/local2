package ex13_static;

import ex11_recursive.Calculater;

public class MainClass {


	
	
	public static void main(String[] args) {
	
		
		
		Calculator calc = new Calculator();                     // calculator 클래스  ,  calc  객체
		System.out.println(calc.addition(1, 2));      // 객체를 이용한 static method 호출은 권장하지 않음...!!
		
		Calculator calc2 = new Calculator();
		System.out.println(calc2.addition(1, 2));

		// static way
		// 객체를 만들지 않고, 클래스를 이용해서 호출
		System.out.println(Calculator.addition(1, 2) );
		
		// 1. system.out     2. math.pow    3. 클래스.parse~~    4. Math.random();
		
		
		
	}

}
