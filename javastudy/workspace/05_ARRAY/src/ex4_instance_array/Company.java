package ex4_instance_array;

public class Company {

	private Staff[]  staffs;   // null        //몇명이 들어갈지 모르니 [] 표시함 
	private int idx;    // 0,    직원이 추가될 인덱스 + 실제 추가된 직원의 수
	
	
	public Company(int staffCount) {        // new Company(10); 생각하고 하기                             // ctrl + 스페이스
	 staffs = new Staff[staffCount];	                                                                               

	}
	
	
	// 직원 추가
	public void addstaff(Staff staff) {
		if (idx == staffs.length) {  // 풀 체크..~!
			System.out.println("더 이상 직원을 추가할 수 없습니다.");                          // 1순위
		     return;     // 메소드 종료
		}
		staffs[idx++] = staff;
	}
	
	// 직원 제거
	public void deleteStaff(int number) {
		if (idx == 0) {   // empty 체크
			System.out.println("아무 직원도 없습니다.");
			return;     // 여기서 종료는  deletestaff 까지..
		}                                                                            // 3순위
		
		if (number <= 0 || number >idx) { // wrong number
			
			System.out.println("존재하지 않는 사원번호입니다.");
			return;
		}
	
	
	/*
	 *   deleteStaff(1);
     *  
	 *  int number = 1;
	 *  | s1 | s2 | s3
	 * 
	 *  0 <- 1  : |s2| s2 | s3 |
	 *  1 <- 2  : |s2| s3 | s3 |         : 반복문으로   
	 *                       idx
	 *             |s2| s3 | null |
	 */
	  
	   
	   for (int i = number; i < idx ; i++) {
	       staffs[i-1] = staffs[i];
	  
	     }                                          // 실무에서는 안할가능성 높음..  
	    idx--;                                          
	    staffs[idx] = null;                           
	 
	 
	}
	
	
	
	// 직원 목록
	public void staffList()  {
		System.out.println("===== 직원목록 ====");
		
		for (int i = 0; i < idx; i++) {
			System.out.println("사원번호(" +  (i + 1) + "), 이름: " + staffs[i].getName() + ", 부서: " + staffs[i].getDept());   // 2순위
		}
		for (Staff s : staffs) {
            // 항상 for문에는 if문 입력하기		
			if (s != null) {
				System.out.println("이름: " + s.getName() + ", 부서: " + s.getDept());
			}
		}
		
	}
	
	
}
