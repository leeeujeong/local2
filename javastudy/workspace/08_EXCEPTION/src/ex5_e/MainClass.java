package ex5_e;

public class MainClass {

	public static void method1() {
		
		try {
			String strAge = "44.8";
			int age = Integer.parseInt(strAge);		
			System.out.println("나이는"+ age);
			}catch(NumberFormatException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
	}
	
	
	public static void method2() {
		try {
		throw new RuntimeException("그냥");	
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void method3() {
		try {
			throw new RuntimeException("예외");
		}catch (Exception e) {
			throw new RuntimeException("e다시 예외",e);
		}
	}
	
	public static void main(String[] args) {
		method3();
	}

}
