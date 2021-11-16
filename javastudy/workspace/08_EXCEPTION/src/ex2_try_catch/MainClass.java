package ex2_try_catch;

public class MainClass {

	public static void main(String[] args) {
		
		try {
			String strAge = "44";
			int age = Integer.parseInt(strAge);
			System.out.println("당신은" + age + "살입니다." );
		} catch(NumberFormatException e) {
			System.out.println("예외발생");
		}

		
		try {
			String name = "제임스";
			if(name.equals("제임스")){
				System.out.println("안녕제임스");
			}else {
				System.out.println("누구야");
			}
		}catch(NullPointerException e) {
		System.out.println("예외발생");
		}

		
		
		try {
			int[]arr = new int[5];
			arr[4] = 10;
			System.out.println(arr[4]);
		}catch(Exception e) {
			System.out.println("예외발생");
		}
}}
