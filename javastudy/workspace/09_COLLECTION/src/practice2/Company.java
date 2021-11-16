package practice2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Company {

	private String name;
	private List<Staff> staffs;
	private Scanner sc = new Scanner(System.in);
	
	public Company(String name) {
		this.name = name;
		staffs= new ArrayList<Staff>();
	}
	
	private void addStaff() {
		try {
		System.out.println("==직원추가==");
		System.out.println("직원번호 입력>");
		long staffNo = sc.nextLong();
		System.out.println("직원이름 입력>");
		String name = sc.next();
		System.out.println("직원부서 입력>");
		String dept = sc.next();
		staffs.add(new Staff(staffNo, name, dept));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void deleteStaff() {
		try {
		System.out.println("==직원삭제==");
		System.out.println("삭제할 직원번호 입력>");
		long staffNo = sc.nextLong();
		for(Staff staff : staffs) {
			if(staff.getStaffNo()==staffNo) {
				System.out.println(staff.getName()+"직원이 삭제됨");
				staffs.remove(staff);
				return;
			}
		}
		System.out.println(staffNo +"직원번호를 가진 사람이 없다.");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void inquiryStaff() {
		try {
			System.out.println("==직원조회==");
			System.out.println("조회사원번호 입력");
			long staffNo = sc.nextLong();
			for(Staff staff : staffs) {
				if(staff.getStaffNo()== staffNo) {
					System.out.println(staff);
					return;
				}
			}
			System.out.println(staffNo +"직원번호를 가진 사람이 없다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void companyInfo() {
		System.out.println("회사명"+name);
		System.out.println("==전체 직원 목록==");
		if(staffs.size() == 0) {
			System.out.println(" 현재 근무중인 직원 없음 ");
			return;
		}
		for(Staff staff : staffs) {
			System.out.println(staff);
		}
	}
	
	private void menu() {
		System.out.println("1.직원 입력");
		System.out.println("2.직원 삭제");
		System.out.println("3.직원 조회");
		System.out.println("4.회사 정보");
		System.out.println("0.작업 종료");
	}
	public void companyManage() {
		while(true) {
			menu();
			System.out.println("선택");
			switch(sc.nextInt()) {
			case 1 : addStaff(); break;
			case 2 : deleteStaff(); break;
			case 3 : inquiryStaff(); break;
			case 4 : companyInfo(); break;
			case 5 : System.out.println("**프로그램 종료**"); return;
			default : System.out.println("다시 선택하세요");
			}
		}
	}
	
}
