package ex4_throw;

import java.util.Scanner;

public class MainClass {

	private static Scanner sc = new Scanner(System.in);
	
	public static void method1() {
		try {
		System.out.print("점수입력(0~100)>>>");
		int score = sc.nextInt();
		if(score<0||score>100) {
			throw new RuntimeException();
		}
		if(score>=60) {
			System.out.println("합격입니다");
		}else {
			System.out.println("불합격입니다.");
		}
		}catch(Exception e) {
			System.out.println("예외가 발생합니다.");
		}
	}
	
	
	public static void method2() throws RuntimeException {
		if(Math.random()<0.5){
		throw new RuntimeException("뭐뭐");
		}else {
			throw new NullPointerException()
;		}
	}
	public static void main(String[] args) {
	
		try {
			method2();
		}catch(Exception e) {
			System.out.println("예외발생");
			System.out.println(e.getMessage());
		}
	}

}
