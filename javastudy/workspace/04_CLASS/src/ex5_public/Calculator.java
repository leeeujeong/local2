package ex5_public;

public class Calculator {

	// 클래스의 메소드는 대부분 외부에 공개한다.
	// 어디서든 접근할 수있는 접근 권한은 public
	// 클래스의 메소드는 public이다.
	
	// 1. 반환타입    : int 
	// 2. 메소드이름 : addition
	// 3. 매개변수    : int 2개
	
	public int addition(int a, int b) {
		
		return a + b;
	}
	
	public int Subtraction (int a, int b) {
		
		return a - b;
	}
	public int mutiplication (int a, int b) {
		
		return a * b;
	}
	public double division(int a, int b) {
		
		return (double)a /b;
	}

	public int power(int a, int b) {
		//return (int)Math.pow(a, b);
	   int result = 1;
	   for(int i = 0; i < b; i++) {  // b만큼 반복하기
		    result *= a;  
		    
	   }
	   return result;
	}	
	
}
