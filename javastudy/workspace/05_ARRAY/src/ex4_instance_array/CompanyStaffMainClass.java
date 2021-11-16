package ex4_instance_array;

public class CompanyStaffMainClass {

	public static void main(String[] args) {
		
		Company company = new Company(3);
		
		
		
		
		company.addstaff(new Staff("이사원", "총무"));
		company.addstaff(new Staff("박과장", "인사"));
		company.addstaff(new Staff("최대리", "전략"));
	   //	company.addstaff(new Staff("정부장", "영업"));  // 풀 체크에 걸려야 함.. 실제로는 안나와야 함


		company.deleteStaff(0);
		company.staffList();
		
	}

}
