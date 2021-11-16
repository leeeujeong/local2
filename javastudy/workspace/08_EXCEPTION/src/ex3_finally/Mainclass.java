package ex3_finally;

import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		try {
			System.out.println("나이를 입력하세요 >>>");
			int age = sc.nextInt();
			System.out.println("입력된 나이는 "+ age+"살입니다");
			
		}catch(Exception e) {
			System.out.println("예외가 발생했다.");
		}finally {
			System.out.println("프로그램이 종료됩니다");
			sc.close();
		}

	}

}
