package practice2;


import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Company {

	private Scanner sc = new Scanner(System.in);
	private Staff[]staffs;
	private int idx;
	
	public Company(int staffCount) {
		staffs = new Staff[staffCount];
	}
	
	public void addStaff() {
	
		System.out.println("직원 추가");
		System.out.print("사원번호입력>>");
		long staffNo = sc.nextLong();
		System.out.print("사원이름 입력>>>");
		String name = sc.next();
		System.out.print("부서입력>>>");
		String dept = sc.next();
		staffs[idx++] = new Staff(staffNo, name, dept);
		}
	
	public void deleteStaff() {
	
		System.out.println("직원 삭제");
		System.out.print("사원번호 입력>>");
		long staffNo = sc.nextLong();
		for(int i =0; i<idx; i++) {
			if( staffs[i].getStaffNo() == staffNo) {
				for(int j = i+1; j<idx;j++) {
				staffs[j-1] = staffs[j];
				}
				staffs[--idx] = null;
			}
		}

	}
	public void printStaff() {
		System.out.println("직원 출력");
		System.out.print("이름입력");
		String name = sc.next();
		boolean exist = false;
		
		
		for(int i=0; i<idx;i++) {
			if(staffs[i].getName().equals(name)) {
				System.out.println(staffs[i]);
				exist = true;
			}
			
		}
		if(exist == false) {
			System.out.println("이름이 "+name + "인 사원이 없습니다.");
		}
	}
	
	public void printAllStaff() {
		System.out.println("전체 직원목록");
		for (int i=0; i<idx; i++ ) {
			System.out.println(staffs[i]);
		}
	}
	public void menu() {
		System.out.println("*****************");
		System.out.println("** 1. 직원등록 **");
		System.out.println("** 2. 직원삭제 **");
		System.out.println("** 3. 직원조회 **");
		System.out.println("** 4. 전체조회 **");
		System.out.println("** 0. 관리종료 **");
		System.out.println("*****************");
	}
	public void staffManage() {
		try {
		while (true) {
			menu();
			System.out.print("선택 >>> ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: addStaff(); break;  // switch문을 끝내는 break
			case 2: deleteStaff(); break;
			case 3: printStaff(); break;
			case 4: printAllStaff(); break;
			case 0: System.out.println("** 직원관리종료 **"); return;  // staffManage() 메소드를 종료하는 return
			}
			}
		}catch (Exception e) {
			System.out.println("예외발생");
		}
		sc.close();
	}
	
}