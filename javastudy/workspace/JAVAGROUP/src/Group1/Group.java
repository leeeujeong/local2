package Group1;

public class Group {

	private Employee[] employee;
	private int idx;
	
	public Group(int count) {
		employee = new Employee[count];
	}
	
	public void hireEmployee(Employee em) {
		if (idx == employee.length) { 
			System.out.println("더 이상 직원을 추가할 수 없습니다.");                    
		     return; 
		}employee[idx++] = em;
	}
	public void dropDmployee(int number) {
		if (idx == 0) {   
			System.out.println("아무 직원도 없습니다.");
			return;    
		}                                                                            
		
		if (number <= 0 || number >idx) { 
			
			System.out.println("존재하지 않는 사원번호입니다.");
			return;
		}
		  for (int i = number; i < idx ; i++) {
		       employee[i-1] = employee[i];
		  
		     }                                        
		    employee[idx] = null;                           
		 
	}
	public void info() {
		
		for (int i = 0; i < idx; i++) {
			System.out.println("사원번호(" +  (i + 1) + "), 이름: " + employee[i].getName() + ", 부서: " + employee[i].getDept()+"급여:" employee[i].getSalary);   
		}
	
	}}
