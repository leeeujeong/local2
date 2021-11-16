package ex1_phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBook {

	private Scanner sc;
	private Phone[] pArray;
	
	public PhoneBook() {
		sc = new Scanner(System.in);
	}
	void input() {
		System.out.println("인원수 >>");
		int n = sc.nextInt();
		
		pArray = new Phone[n];
		
		for(int i =0; i<pArray.length; i++) {
			System.out.println("이름과 전화번호 >>");
			String name = sc.next();
			String tel = sc.next();
			pArray[i] = new Phone(name, tel);
		}
		System.out.println("저장완료");
	}
	
	String search(String name) {
		for(int i=0; i<pArray.length; i++) {
			if(pArray[i].getName().equals(name)) {
				return pArray[i].getTel();
			}
		}return null;
	}
	void run() {
		input();
		while(true) {
			System.out.println("검색할 이름>>");
			String name = sc.next();
			if(name.equals("그만")) {
				System.out.println("프로그램 종료");
				break;
			}
			String tel = search(name);
			if(tel == null) {
				System.out.println(name+ "이 없습니다.");
			}else
				System.out.println(name+"의 번호는" + tel +"입니다.");
		}
		sc.close();
	}
}
