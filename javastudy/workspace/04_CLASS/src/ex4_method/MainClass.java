package ex4_method;

public class MainClass {

	public static void main(String[] args) {
		
		
		VendingMachine vm = new VendingMachine();
		
	 String result1 = 	vm.pushbutton(500);
	 String result2 = 	vm.pushbutton(1000);
	 String result3 = 	vm.pushbutton(1500);
	 String result4 = 	vm.pushbutton(2000);

	 
	 System.out.println(result1);
	 System.out.println(result2);
	 System.out.println(result3);
	 System.out.println(result4);
	 
	 
	}

}
